<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header>
        <h1 class="logo">Logo</h1>
        <div class="navbar">
          <ul class="navbar__link">
              <li><a href="/HotelManager/">Home</a></li>
              <li><a href="/HotelManager/rooms">Room</a></li>
              <li><a href="/HotelManager/about">About</a></li>
              <li><a href="/HotelManager/contact">Contact</a></li>
          </ul>
        </div>
        <div class="navbar__action">
            <div class="navbar-list">
                <p href="" onclick="listCartBtnClick()" class="navbar-list-btn"><i class="fa-solid fa-clipboard-list"></i><span>1</span></p>
                <div class="list-container">
                    <div class="list-room">
                        <img src="https://images.unsplash.com/photo-1593006526979-5f8814c229f9?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8cm9vbSUyMGhvdGVsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="">
                        <div class="list-room-detail">
                            <p class="name">Phòng Tổng Thống</p>
                            <p>$10000</p>
                        </div>
                        <button><i class="fa-solid fa-trash"></i></button>
                    </div>
                    <div class="list-room">
                        <img src="https://images.unsplash.com/photo-1593006526979-5f8814c229f9?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8cm9vbSUyMGhvdGVsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="">
                        <div class="list-room-detail">
                            <p class="name">Phòng Tổng Thống</p>
                            <p>$10000</p>
                        </div>
                        <button><i class="fa-solid fa-trash"></i></button>
                    </div>
                    <div class="list-room">
                        <img src="https://images.unsplash.com/photo-1593006526979-5f8814c229f9?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8cm9vbSUyMGhvdGVsfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60" alt="">
                        <div class="list-room-detail">
                            <p class="name">Phòng Tổng Thống</p>
                            <p>$10000</p>
                        </div>
                        <button><i class="fa-solid fa-trash"></i></button>
                    </div>
                    <div class="list-booking">
                        <div class="list-total">
                            <h5>Total: <span>30000</span></h5>
                        </div>
                        <button>Tiếp Tục</button>
                    </div>
                </div>
            </div>
            <span class="open"><i class="fa-solid fa-bars"></i></span>
        </div>
    </header>
