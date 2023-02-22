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
			<label for="roomtype">Loại phòng: </label> <select name="roomtype"
				id="roomtype" onchange="getRoomList()">
				<option value="0">Tất cả</option>
				<c:forEach items="${roomTypes}" var="roomType">
					<option value="${roomType.id}">${roomType.name}</option>
				</c:forEach>
			</select>
		</div>
		<div class=status>
			<span class="label">Trạng thái phòng: </span>
			<div>
				<a href="#">Tất cả (${count})</a> <a href="#"> <i
					class="fa-solid fa-person-walking-luggage green"></i><span>
						Chuẩn bị đến (1) </span></a> <a href="#"> <i
					class="fa-solid fa-person-walking-luggage blue"></i><span>Đang
						ở (0) </span></a> <a href="#"> <i
					class="fa-solid fa-person-walking-luggage red"></i> <span>Chuẩn
						bị rời đi (21)</span>
				</a> <a href="#" class="empty"> </i> <span class="color_white">Phòng
						trống (21)</span>
				</a> <a href="#" class="dirty"> </i> <span class="color_white">
						Phòng bẩn (21)</span>
				</a> <a href="#" class="repair"> </i> <span class="color_white">Phòng
						đang sửa (21)</span>
				</a>
			</div>
		</div>
		<div class="details">
			<div class="detail green">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail red">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail orange">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail green">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail red">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail orange">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail green">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail red">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail orange">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail green">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail red">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
			<div class="detail orange">
				<p class="room_no">101</p>
				<p class="room_type">Standar</p>
				<i class="fa-solid fa-circle-check white"></i>
			</div>
		</div>
	</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>

</body>
</html>