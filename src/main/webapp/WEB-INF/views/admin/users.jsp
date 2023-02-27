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
	<div class="heading">
		<h1>Users</h1>
	    <a href="/HotelManager/admin/addusers" class="addnew-page">Add New</a>
	</div>
                <div class="main-container">
                    <div class="table-container">
                        <table class="table">
                            <thead class="thead-dark">
                              <tr>
                                <th scope="col">Full name</th>
                                <th scope="col">Birthday</th>
                                <th scope="col">Createday</th>
                                <th scope="col">Gender</th>
                                <th scope="col">Phone Number</th>
                                <th scope="col">Address</th>
                                <th scope="col">Role</th>
                                <th scope="col">Action</th>
                              </tr>
                            </thead>
                            <tbody>
                              <c:forEach var="userslist" items="${userslist}">
	                              <tr>
	                                
	                                <td>${userslist.fullname}</td>
	                                <td>${userslist.birthday}</td>
	                                <td>${userslist.createday}</td>
	                                <td>${userslist.gender}</td>
	                                <td>${userslist.phone_number}</td>
	                                <td>${userslist.address}</td>
	                                <td>${userslist.role.rolename}</td>
	                                <td>
		                                <button onclick="location.href='/HotelManager/admin/editusers?id=${userslist.id}'" type="button" class="btn btn-success">Edit</button>
		                                <button onclick="location.href='deleteusers?id=${userslist.id}'" type="button" class="btn btn-danger">Delete</button>
	                                </td>
	                              </tr>
                              </c:forEach>	
                            </tbody>
                        </table>
                    </div>
                </div>
</body>
</html>