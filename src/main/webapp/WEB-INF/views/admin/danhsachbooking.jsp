<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 >Danh sách đặt phòng</h2>

                <div class="search-booking">
                    <form action="">
                        <div class="form-input">
                            <label for="">Số Điện Thoại</label>
                            <input type="text" placeholder="Nhập vào số điện thoại">
                        </div>
                        <div class="form-input">
                            <label for="">Trạng Thái</label>
                            <select>
                                <option value="">Chọn trạng thái</option>
                                <option value="">Tất cả</option>
                                <option value="">Mới</option>  
                                <option value="">Chưa thanh toán</option>  
                                <option value="">Đã thanh toán</option> 
                            </select>
                        </div>
                        <div class="form-input">
                            <label for="">Check In</label>
                            <input type="date" >
                        </div>
                        <div class="form-input">
                            <label for="">Check Out</label>
                            <input type="date">
                        </div>
                        <button><i class="fa-solid fa-magnifying-glass"></i></button>
                    </form>
                </div>
                <table class="table">
                    <thead class="thead-dark">
                      <tr>
                        <th scope="col">Số Hoá Đơn</th>
                        <th scope="col">Thông Tin Người Đặt</th>
                        <th scope="col">Thời Gian Đặt</th>
                        <th scope="col">Check In</th>
                        <th scope="col">Check Out</th>
                        <th scope="col">Trạng Thái</th>
                        <th scope="col">Thao Tác</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>HD00001</td>
                        <td>
                        	<p>Cao Hữu Hiếu</p>
                        	<p>0788556847</p>
                        </td>
                        <td>12:20 12-12-2022</td>
                        <td>12:20 12-12-2022</td>
                        <td>12:20 12-12-2022</td>
                        <td>Mới</td>
                        <td>
                            <button type="button" class="btn btn-success">View</button>
                            <button type="button" class="btn btn-danger">Delete</button>
                        </td>
                      </tr>
                    </tbody>
                </table>
</body>
</html>