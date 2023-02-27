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
	roomStatusClick(0) 	
	  
}
function roomStatusClick(status){
	let html = ''
	let roomType = document.querySelector("#roomtype").value
	console.log(roomType, " hihihihi    ", status)
	fetch(`http://localhost:8080/HotelManager/api/getRoomList?roomtype=${roomType}&status=${status}`)
	  .then((response) => response.json())
	  .then((data) => {
		  let result = data;
		  result.forEach(room => {
			  let color = ''
			  if(room.status == 1) {
				  color = 'background_green'
			  }else if(room.status == 2) {
				  color = 'background_blue'
			  }else if(room.status == 3){
				  color = 'background_purple'
			  }else if(room.status == 4){
				  color = 'background_pink'
			  }else if(room.status == 5){
				  color = 'background_orange'
			  }else if(room.status == 6){
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
