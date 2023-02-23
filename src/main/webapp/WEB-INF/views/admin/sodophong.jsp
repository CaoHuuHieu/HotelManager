<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
	<div class="room">
		<div class="header">
			<i class="fa-solid fa-hotel"></i> <span>Sơ đồ phòng</span>
		</div>
		<div class="select">
			<label for="roomtype">Loại phòng: </label> 
			<select name="roomtype"
				id="roomtype" onchange="countRoomByType()">
				<option value="0">Tất cả</option>
				<c:forEach items="${roomTypes}" var="roomType">
					<option value="${roomType.id}">${roomType.name}</option>
				</c:forEach>
			</select>
		</div>
		<div class="status" >
			<span class="label">Trạng thái phòng: </span>
			<div>
				<span class="roomstatus" onclick="roomStatusClick(1)" >Tất cả(<span class="quantity"></span>)</span></span> 
				<span class="roomstatus color_white empty" onclick="roomStatusClick(1)">  <span >Phòng
						trống(<span class="quantity"></span>)</span>                   
				</span>
				<span class="roomstatus" onclick="roomStatusClick(2)" > 
					<i class="fa-solid fa-person-walking-luggage green"></i><span>
						Chuẩn bị đến(<span class="quantity"></span>) </span></span> 
				<span class="roomstatus" onclick="roomStatusClick(3)"> <i
					class="fa-solid fa-person-walking-luggage blue"></i>
					<span>Đang ở(<span class="quantity"></span>) </span>
				</span> 
				<span class="roomstatus" onclick="roomStatusClick(4)"><i class="fa-solid fa-person-walking-luggage red"></i> 
					<span>Chuẩn bị rời(<span class="quantity"></span>)</span>
				</span>  <span class="roomstatus color_white dirty" onclick="roomStatusClick(5)"><span >
						Phòng bẩn(<span class="quantity"></span>)</span>               
				</span> <span class="roomstatus color_white repair" onclick="roomStatusClick(6)"> <span >Đang sửa chữa(<span class="quantity"></span>)</span>                
				</span>
			</div>	
		</div>
		<div class="details"  onload="roomStatusClick(0)">
			
		</div>
	</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>

</body>
</html>