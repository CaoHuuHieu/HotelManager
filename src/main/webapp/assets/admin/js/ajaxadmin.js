
function getRoomList() {
	console.log("Ddã vào")
	fetchData();
}

const fetchData = ()=>{
	fetch('http://localhost:8080/HotelManager/admin/laysophong')
	  .then((response) => response.json())
	  .then((data) => console.log(data));
}