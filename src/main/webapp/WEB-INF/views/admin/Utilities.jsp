<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="service-hotel-container">
                    <div class="heading">
                        <h5>Utilities</h5>
                        <a href="/HotelManager/admin/addutilities" class="addnew-page">Add New</a>  
                    </div>
                    <div class="table-container">
                        <table class="table">
                            <thead class="thead-dark">
                              <tr>
                                <th scope="col"></th>
                                <th scope="col">Name</th>
                                <th scope="col">Description</th>
                                <th scope="col">Action</th>
                              </tr>
                            </thead>
                            <tbody>
                              <c:forEach var="utilist" items="${utilist}">
                              	<tr>
                                	<td>${utilist.thumbnail}</td>
                                	<td>${utilist.name}</td>
                                	<td>${utilist.description}</td>
                                	<td>
                                    	<button onclick="location.href='/HotelManager/admin/editutilities?id=${utilist.id}'" type="button" class="btn btn-success"><i class="fa-solid fa-pen-to-square"></i></button>
                                    	<button onclick="location.href='deleteutilities?id=${utilist.id}'" type="button" class="btn btn-danger"><i class="fa-solid fa-trash"></i></button>
                                	</td>
                                </tr>
                              </c:forEach>
                            </tbody>
                        </table>
                    
                </div>
                
                <%-- <div class="add-new-container">
                    <h5>Add new Utilities</h5>
                    <div class="add-new">
                        <form:form method="post" action="saveuti?thaotac=${method}">
                        	<form:hidden  path="id" />
                            <div class="form-input">
                                <label>Name: </label>
                                <form:input type="text" path="name" placeholder="Enter name"/>
                            </div>
                            <div class="form-input">
                                <label>Description: </label>
                                <form:input type="text" path="description" placeholder="Enter description"/>
                            </div>
                            <div class="form-input">
                                <label>Thumbnail: </label>
                                <form:input type="text" path="thumbnail" placeholder="Enter thumbnail"/>
                            </div>
                            <button type="submit" class="save">Save</button>
                        </form:form>
                    </div>
                </div> --%>
            </div>
</body>
</html>