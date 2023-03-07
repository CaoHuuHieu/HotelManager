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
				<span class="roomstatus" onclick="roomStatusClick(0)" >Tất cả</span> 
				<span class="roomstatus color_white background_green " onclick="roomStatusClick(1)">Phòng trống  </span>                   

				<span class="roomstatus background_blue color_white" onclick="roomStatusClick(2)" > 
					<i class="fa-solid fa-person-walking-luggage color_white"></i><span class="color_white">
						Chuẩn bị đến</span> 
									</span> 
				<span class="roomstatus background_purple" onclick="roomStatusClick(2)"> <i
					class="fa-solid fa-person-walking-luggage color_white"></i>
					<span class="color_white">Đang ở
				</span> 
							</span> 
				<span class="roomstatus background_pink" onclick="roomStatusClick(2)"><i class="fa-solid fa-person-walking-luggage color_white"></i> 
					<span class="color_white">Chuẩn bị rời</span>
				</span>  <span class="roomstatus color_white background_orange" onclick="roomStatusClick(3)"><span class="color_white">
						Phòng bẩn</span>               
				</span> <span class="roomstatus color_white background_red" onclick="roomStatusClick(4)"> <span class="color_white">Đang sửa chữa</span>                
				</span>
			</div>	
		</div>
		<div class="details">
			
		</div>
	</div>
</body>
</html>