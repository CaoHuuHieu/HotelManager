let detailContainer = document.getElementsByClassName('details')
const roomStatus = document.getElementsByClassName("roomstatus");
function countRoomByType(){
	let roomType = document.querySelector("#roomtype").value;
	fetch(`http://localhost:8080/HotelManager/api/countRoomByType?roomtype=${roomType}`)
	  .then((response) => response.json())
	  .then((data) => {
		  	const spanNumber = document.getElementsByClassName('quantity');
		  	for(let i = 0; i < data.length; i++)
			  spanNumber[i].innerText = data[i];
	  });	
	  
}
function roomStatusClick(status){
	let html = ''
	let roomType = document.querySelector("#roomtype").value

	fetch(`http://localhost:8080/HotelManager/api/getRoomList?roomtype=${roomType}&status=${status}`)
	  .then((response) => response.json())
	  .then((data) => {
		  let result = data;
		  result.forEach(room => {
			  let color = ''
			  if(room.status == 0) {
				  color = 'background_green'
			  }else if(room.status == 1) {
				  color = 'background_orange'
			  }else {
				  color = 'background_red'
			  }
			  html += `
				  	<div class="detail ${color}">
						<p class="room_no"> ${room.room_no} </p>
						<p class="room_type">${room.name_type}</p>
						<i class="fa-solid fa-circle-check color_white"></i>
					</div>
				  `
		  }) 
	  	  detailContainer[0].innerHTML = html
	  });	
}
window.onload = () => {
	roomStatusClick(0)
	countRoomByType();
}
