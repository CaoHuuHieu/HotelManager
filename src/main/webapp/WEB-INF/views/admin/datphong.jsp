<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="addNewBooking" method="post" modelAttribute="bookingdto" acceptCharset="utf-8" >
		<h2>Check Booking</h2>
		<div class="main-check-booking">
			<div class="left">
				<c:forEach items="${bookingDetails}" var="bookingDetail">
					<div class="check-booking-detail">

						<div class="detail-cus">
							<p>${bookingDetail.bookingEntity.custommer.fullname}</p>
							<p>${bookingDetail.bookingEntity.custommer.phone_number}</p>
						</div>
						<div class="detail-date">
							<p>
								<span>${bookingDetail.bookingEntity.checkin}</span> - <span>${bookingDetail.bookingEntity.checkout}</span>
							</p>
						</div>

					</div>
				</c:forEach>
				<div class="popup-check-booking">
					<div class="right">
						<h5>Thông tin khách hàng</h5>
						<div class="input-form">
							<form:input type="hidden" value="${idroom}" path="idRoom"/>
							<div class="text">
								<input type="text" name="cccd" id="cccd"
									placeholder="Số CMND/CCCD" onblur="findCustommer(this)">
								<span><i class="fa-solid fa-address-card"></i></span>
							</div>
						</div>
						<div class="input-form">
							<div class="text">
								<form:input type="text" path="fullName" id="fullname"
									placeholder="Tên Người Đặt"/> <span><i
									class="fa-solid fa-user"></i></span>
							</div>
						</div>
						<div class="input-form">
							<div class="text">
								<form:input type="text" id="email" path="email" placeholder="Email"/>
								<span><i class="fa-solid fa-envelope"></i></span>
							</div>
							<div class="text">
								<form:input type="text" id="phone" path="phone_number"
									placeholder="Số Điện Thoại"/> <span><i
									class="fa-solid fa-phone"></i></span>
							</div>
						</div>
						<div class="input-form">
							<div class="text">
								<form:input type="date" id="birth" path="birthDay"
									placeholder="Ngày Sinh"/> <span><i
									class="fa-solid fa-cake-candles"></i></span>
							</div>
						</div>
						<div class="input-form">
							<div class="text">
								<form:input type="text" id="address" path="address"
									placeholder="Địa Chỉ"/> <span><i
									class="fa-solid fa-house"></i></span>
							</div>
						</div>
						<form:textarea name="" id="" cols="90" rows="0" path="ghiChu"
							placeholder="Ghi Chú"></form:textarea>
						<button>Đặt phòng</button>
					</div>
				</div>
			</div>
			<div class="right">
				<h3>Đặt Phòng</h3>
				<div class="form">
					<div class="form-input">
						<label for="">Check In</label> <form:input type="date" path="checkIn"
							id="dateCheckIn"/>
					</div>
					<div class="form-input">
						<label for="">Check Out</label> <form:input type="date" path="checkOut"
							id="dateCheckOut" />
					</div>

					<span id="message">Phòng đã được sử dụng trong thời gian này</span>
					<span class="button" onclick="kiemTraDatPhong()">Kiểm Tra
						Đặt Phòng</span>
				</div>
			</div>
		</div>
	</form:form>
</body>
</html>