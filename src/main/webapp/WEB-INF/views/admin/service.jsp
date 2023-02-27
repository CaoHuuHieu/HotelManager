<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
                <div class="service-hotel-container">
                    <div class="heading">
                        <h5>Dịch Vụ Khách Sạn</h5>
                       <!--  <span><i class="fa-solid fa-earth-americas"></i></span> -->
                       <a href="/HotelManager/admin/addservice" class="addnew-page">Add New</a>  
                    </div>
                    <div class="table-container">
                        <table class="table">
                            <thead class="thead-dark">
                              <tr>
                               
                                <th scope="col"></th>
                                <th scope="col">Title</th>
                                <th scope="col">Name Category</th>
                                <th scope="col">Price</th>
                                <th scope="col">Amount</th>
                                <th scope="col">Description</th>
                                <th scope="col">Action</th>
                              </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="listservice" items="${listservice}">
                            	<tr>
                            		
                                	<td>${listservice.thumbnail}</td>
                                	<td>${listservice.title}</td>
                                	<td>${listservice.category.name}</td>
                                	<td>${listservice.price}</td>
                                	<td>${listservice.amount}</td>
                                	<td>${listservice.description}</td>
                                	<td>
                                    	<button onclick="location.href='/HotelManager/admin/editservice?id=${listservice.id}'" type="button" class="btn btn-success"><i class="fa-solid fa-pen-to-square"></i></button>
                                    	<button onclick="location.href='deleteservice?id=${listservice.id}'" type="button" class="btn btn-danger"><i class="fa-solid fa-trash"></i></button>
                                	</td>
                            	</tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        
                </div>
            </div>
</body>
</html>