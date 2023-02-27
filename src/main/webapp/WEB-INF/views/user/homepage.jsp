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
	<div class="header-banner">
        <img src="https://static.vinwonders.com/2022/04/cau-rong-da-nang-1-1.jpg" alt="">
        <div class="header-search">
            <form action="">
                <div class="search-input">
                    <span><i class="fa-solid fa-calendar-days"></i></span>
                    <div class="form-input">
                        <label for="">Check in</label>
                        <input type="date">
                    </div>
                </div>
                <div class="search-input">
                    <span><i class="fa-solid fa-calendar-days"></i></span>
                    <div class="form-input">
                        <label for="">Check out</label>
                        <input type="date">
                    </div>
                </div>
                <div class="search-input">
                    <span><i class="fa-solid fa-user"></i></span>
                    <div class="form-input">
                        <label for="">Guest</label>
                        <input type="number" min="0">
                    </div>
                </div>
                <button><i class="fa-solid fa-magnifying-glass"></i></button>
            </form>
        </div>
    </div>
    <div class="main">
        <div class="hotel-master-room">
            <div class="heading">
                <h1>Hotel Master Room</h1>
                <span>Lorem ipsum, dolor sit amet consectetur adipisicing elit.</span>
            </div>
            <div class="slide-master-room">
                <div class="card">
                    <img src="https://images.unsplash.com/photo-1611892440504-42a792e24d32?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGhvdGVsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="">
                    <span class="room-name">Tên Phòng</span>
                    <div class="room-type">
                        <span>Room No</span>
                        <span>Room type</span>
                    </div>
                    <span class="room-size">Size: <b>2</b></span>
                    <p class="card-desc">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi doloribus et sint eius? 
                        Ipsam quos ad deserunt nobis enim non minima nemo in illum repellendus, expedita velit id molestias sit.
                    </p>
                    <span class="room-price"><i class="fa-solid fa-money-check-dollar"></i>$10000</span>
                </div>
                <div class="card">
                    <img src="https://images.unsplash.com/photo-1611892440504-42a792e24d32?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGhvdGVsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="">
                    <span class="room-name">Tên Phòng</span>
                    <div class="room-type">
                        <span>Room No</span>
                        <span>Room type</span>
                    </div>
                    <span class="room-size">Size: <b>2</b></span>
                    <p class="card-desc">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi doloribus et sint eius? 
                        Ipsam quos ad deserunt nobis enim non minima nemo in illum repellendus, expedita velit id molestias sit.
                    </p>
                    <span class="room-price"><i class="fa-solid fa-money-check-dollar"></i>$10000</span>
                </div>
                <div class="card">
                    <img src="https://images.unsplash.com/photo-1611892440504-42a792e24d32?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGhvdGVsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="">
                    <span class="room-name">Tên Phòng</span>
                    <div class="room-type">
                        <span>Room No</span>
                        <span>Room type</span>
                    </div>
                    <span class="room-size">Size: <b>2</b></span>
                    <p class="card-desc">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi doloribus et sint eius? 
                        Ipsam quos ad deserunt nobis enim non minima nemo in illum repellendus, expedita velit id molestias sit.
                    </p>
                    <span class="room-price"><i class="fa-solid fa-money-check-dollar"></i>$10000</span>
                </div>
                <div class="card">
                    <img src="https://images.unsplash.com/photo-1611892440504-42a792e24d32?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGhvdGVsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="">
                    <span class="room-name">Tên Phòng</span>
                    <div class="room-type">
                        <span>Room No</span>
                        <span>Room type</span>
                    </div>
                    <span class="room-size">Size: <b>2</b></span>
                    <p class="card-desc">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi doloribus et sint eius? 
                        Ipsam quos ad deserunt nobis enim non minima nemo in illum repellendus, expedita velit id molestias sit.
                    </p>
                    <span class="room-price"><i class="fa-solid fa-money-check-dollar"></i>$10000</span>
                </div>
            </div>
        </div>

        <div class="hotel-saving">
            <div class="heading">
                <h1>Savings</h1>
                <span>Lorem ipsum, dolor sit amet consectetur adipisicing elit.</span>
                <button>SEE MORE</button>
            </div>
        </div>

        <div class="hotel-service">
            <div class="heading">
                <h1>Our Service</h1>
                <span>Lorem ipsum, dolor sit amet consectetur adipisicing elit.</span>
            </div>

            <div class="service-slide">
                <div class="card-service">
                    <img src="https://images.unsplash.com/photo-1493770348161-369560ae357d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fGZvb2R8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60" alt="">
                    <span class="service-name">Hồ Bơi</span>
                    <p class="service-desc">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Quas beatae minus deleniti ratione ea similique, recusandae nisi provident non distinctio tempora natus dignissimos excepturi porro iste obcaecati accusantium, ullam esse.</p>
                </div>
                <div class="card-service">
                    <img src="https://images.unsplash.com/photo-1493770348161-369560ae357d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fGZvb2R8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60" alt="">
                    <span class="service-name">Hồ Bơi</span>
                    <p class="service-desc">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Quas beatae minus deleniti ratione ea similique, recusandae nisi provident non distinctio tempora natus dignissimos excepturi porro iste obcaecati accusantium, ullam esse.</p>
                </div>
                <div class="card-service">
                    <img src="https://images.unsplash.com/photo-1493770348161-369560ae357d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fGZvb2R8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60" alt="">
                    <span class="service-name">Hồ Bơi</span>
                    <p class="service-desc">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Quas beatae minus deleniti ratione ea similique, recusandae nisi provident non distinctio tempora natus dignissimos excepturi porro iste obcaecati accusantium, ullam esse.</p>
                </div>
                <div class="card-service">
                    <img src="https://images.unsplash.com/photo-1493770348161-369560ae357d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fGZvb2R8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60" alt="">
                    <span class="service-name">Hồ Bơi</span>
                    <p class="service-desc">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Quas beatae minus deleniti ratione ea similique, recusandae nisi provident non distinctio tempora natus dignissimos excepturi porro iste obcaecati accusantium, ullam esse.</p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>