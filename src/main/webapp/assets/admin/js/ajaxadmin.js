let detailContainer = document.getElementsByClassName('details')
let detailBtn = document.getElementsByClassName('detail')
let controlElement = document.getElementsByClassName('control')
const roomStatus = document.getElementsByClassName("roomstatus");

function roomStatusClick(status){
	html = ''
	let roomType = document.querySelector("#roomtype").value
	 $.ajax({
		 	async: false,
     	    type: "GET",
            url: `http://localhost:8080/HotelManager/api/getRoomsByTypeAndStatus?type=${roomType}&status=${status}`,
            contentType: "application/json; charset=utf-8",
            datatype: "json",
            success: function (res) {
			 	detailContainer[0].innerHTML = "";
				 res.forEach((room, index) => {
					  let color = ''
					  let room_status = ''
					  if(room.status == 2){
						   getBookingDetailByRoomID(room.id, index);
					  }else{
					   	if(room.status == 1) {
							  color = 'background_green'
							  room_status = '<p class="room_status">Phòng trống</p>'
						  }else if(room.status == 3){
							  color = 'background_orange'
							  room_status = '<p class="room_status">Phòng bẩn</p>'
						  }else if(room.status == 4){
							    color = 'background_red'
							  room_status = '<p class="room_status">Đang sửa chữa</p>'
						  }
						  html = `
								  	<div class="detail ${color}" onclick="clickControl(${index})">
										<div> 
											<div class="flex_container">
												<p class="room_no"> ${room.room_no} </p>
												<div style="flex: 1">
													<p class="room_type">${room.roomTypeEntity.name}</p>
													${room_status}
												</div>
											</div>
										</div>
										<div class="control">
											<a href="/HotelManager/admin/datphong?roomid=${room.id}"> Tạo đặt phòng</a>
											<a href="#"> Nhận phòng</a>
											<a href="#"> Đặt dịch vụ</a>
											<a href="#"> Trả phòng</a>
										</div>
									</div>
								  `
								   detailContainer[0].insertAdjacentHTML('beforeend', html)
				  	}
				 })
         	}
        });
}
function getBookingDetailByRoomID(roomID, index){
	$.ajax({
			async: false,
            type: "GET",
            url: `http://localhost:8080/HotelManager/api/getBookingDetailByID?roomID=${roomID}`,
            contentType: "application/json; charset=utf-8",
            datatype: "json",
            success: function (res) {
					let color = ''
					let checkIn = new Date(res.bookingEntity.checkin);
				 	let checkOut =  new Date(res.bookingEntity.checkout); 
				 	let date = new Date()
				 	let toDay = new Date(date.getUTCFullYear(), date.getUTCMonth(), date.getUTCDate()); 
				 	if(checkIn.getTime() === toDay.getTime()){
						 color = 'background_blue'
					 }else if(checkOut.getTime() === toDay.getTime()){
						 color = 'background_pink'
					 }else if(checkIn.getTime() < toDay.getTime() && checkOut.getTime() > toDay.getTime()){
						 color = 'background_purple'
					 }

			  		let room_status = res.bookingEntity.custommer.fullname;
					let html = `
						 <div class="detail ${color}" onclick="clickControl(${index})">
									<div> 
										<div class="flex_container">
											<p class="room_no"> ${res.roomEntity.room_no} </p>
											<div style="flex: 1">
												<p class="room_type">${res.roomEntity.roomTypeEntity.name}</p>
												<p class="room_status">${room_status}</p>
											</div>
										</div>
										<div>
											<p class="room_date">${checkIn.toLocaleDateString()}---${checkOut.toLocaleDateString() }</p>
										 </div>
									</div>
									<div class="control">
										<a href="/HotelManager/admin/datphong?roomid=${res.roomEntity.id}"> Tạo đặt phòng</a>
										<a href="#"> Nhận phòng</a>
										<a href="#"> Đặt dịch vụ</a>
										<a href="#"> Trả phòng</a>
									</div>
							</div>
					 `
			  detailContainer[0].insertAdjacentHTML('beforeend', html)
				}
        });
}
function clickControl(i){
	for(let j = 0; j < controlElement.length; j++){
		if(j != i){
				controlElement[j].style.display = 'none';
		}else{
			if(controlElement[j].style.display == 'none') {
				controlElement[i].style.display = 'block';
			}else{
				controlElement[i].style.display = 'none';
			};
		}
		
	}
}
window.onload = () => {
	roomStatusClick(0)
}
	
function kiemTraDatPhong(){
	const queryString = window.location.search;
	const urlParams = new URLSearchParams(queryString);
	const idRoom = urlParams.get('roomid')
	let popup = document.getElementsByClassName("popup-check-booking");	
	let dateCheckIn = document.getElementById("dateCheckIn").value;
	let dateCheckOut = document.getElementById("dateCheckOut").value;
	let messageEle = document.getElementById("message");
	$.ajax({
			async: false,
            type: "GET",
           	url: "http://localhost:8080/HotelManager/api/checkNewDateBooking",
            data: {
				"idRoom": idRoom,
				"checkIn": dateCheckIn,
				"checkOut":dateCheckOut
			},
            contentType: "application/json; charset=utf-8",
            datatype: "json",
            success: function (res) {
				if(res == 0){		
					popup[0].style.display = 'flex'
					messageEle.style.display = 'none'
				}else{
					messageEle.style.display = 'block'
				}
			}
        });
}
function findCustommer(){
	const cccdEle = document.getElementById("cccd")
	const cccd = cccdEle.value
	$.ajax({
			async: false,
            type: "GET",
           	url: "http://localhost:8080/HotelManager/api/findCustomer",
            data: {
				"cccd": cccd,
			},
            contentType: "application/json; charset=utf-8",
            datatype: "json",
            success: function (res) {
				if(res.length > 0){
					const fullname = document.getElementById("fullname");
					const email = document.getElementById("email");
					const phone  = document.getElementById("phone");
					const address = document.getElementById("address");
					const birth  = document.getElementById("birth");
				 	const custommer = res[0];
				 	fullname.value = custommer.fullname
				 	email.value = custommer.email
				 	phone.value = custommer.phone_number
				 	address.value = custommer.address
				 	birth.value = "12-12-2022"
				}
			}
        });
}

