<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

        <div class="sidebar">
          <div class="top">
            <a href="/admin/index.html" class="text-style">
              <span class="logo">Admin</span>
            </a>
          </div>
          <div class="center">
            <ul>
              <p class="title">MAIN</p>
              <a href="/admin/index.html" class="text-style">
                <li>
                  <i class="fa-solid fa-chart-simple"></i>
                  <span>Dashboard</span>
                </li>
              </a>
              <p class="title">LIST</p>
              <a href="/HotelManager/admin/room" class="text-style">
                <li>
                  <i class="fa-solid fa-hotel"></i>
                  <span>Room</span>
                </li>
              </a>
           
                <li>
                <div class="dropdown">
                	<div class="dropbtn">	
                		<i class="fa-solid fa-hotel"></i>
                  		<span>Quản lý đặt phòng</span>
                  	</div>	
			  		  <div class="dropdown-content">
					    <a href="/HotelManager/admin/sodophong" class="text-style">
              		   		<i class="fa-solid fa-hotel"></i>
               		   		<span>Sơ đồ phòng</span>
               		    </a>
               		    <a href="/HotelManager/admin/danhsachdatphong" class="text-style">
              		   		<i class="fa-solid fa-hotel"></i>
               		   		<span>Danh sách đặt phòng</span>
               		    </a>
               		      <a href="/HotelManager/admin/datphongtructiep" class="text-style">
              		   		<i class="fa-solid fa-hotel"></i>
               		   		<span>Đặt phòng trực tiếp</span>
               		    </a>
               		     <a href="/HotelManager/admin/quanlydatphong" class="text-style">
              		   		<i class="fa-solid fa-hotel"></i>
               		   		<span>Check in</span>
               		    </a>
               		     <a href="/HotelManager/admin/quanlydatphong" class="text-style">
              		   		<i class="fa-solid fa-hotel"></i>
               		   		<span>Check out</span>
               		    </a>
					  </div>
					</div>
                </li>
              <a href="/quanlydatphong" class="text-style">
                <li>
                  <i class="fa-solid fa-user"></i>
                  <span>Users</span>
                </li>
              </a>
              <a href="/admin/employee.html" class="text-style">
                <li>
                  <i class="fa-solid fa-clipboard-user"></i>
                  <span>Employee</span>
                </li>
              </a>
              <a href="/admin/booking.html" class="text-style">
                <li>
                  <i class="fa-solid fa-bookmark"></i>
                  <span>Booking</span>
                </li>
              </a>
            </ul>
          </div>
        </div>
      </div>
      <div class="right">
        <div class="navbar">
          <div class="wrapper">
            <div class="search">
              <input type="text" placeholder="Search..." />
              <i class="fa-solid fa-magnifying-glass"></i>
            </div>
            <div class="items">
              <div class="item">
                <i class="fa-solid fa-language"></i> VietNam
              </div>
              <div class="item">
                <i class="fa-solid fa-moon"></i>
              </div>
              <div class="item">
                <i class="fa-solid fa-grip-lines"></i>
              </div>
              <div class="item">
                <i class="fa-solid fa-bell"></i>
                <div class="counter">1</div>
              </div>
              <div class="item">
                <i class="fa-solid fa-comment"></i>
                <div class="counter">1</div>
              </div>
              <div class="item">
                <i class="fa-solid fa-list-ul"></i>
              </div>
              <div class="item">
                <img
                  src="https://kiemtientuweb.com/ckfinder/userfiles/images/anh-rose/rose-2.jpg"
                  alt=""
                  class="avatar"
                />
              </div>
            </div>
          </div>
        </div>
       
      <script>
      		const dropBtn = document.getElementsByClassName("dropbtn");
      		const dropEle = document.querySelector(".dropdown")
      		dropEle.addEventListener("click", () => {
      			dropEle.classList.toggle("active")   			
      			/* const dropContent = document.getElementsByClassName("dropdown-conten") */
      		})
      		
      		
      
      </script>