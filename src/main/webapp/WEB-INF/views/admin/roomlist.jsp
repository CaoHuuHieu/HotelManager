<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <div class="heading">
                    <h1>Room</h1>
                    <a href="/HotelManager/admin/addroom" class="addnew-page">Add New</a>
                </div>
                <div class="main-container">
                    <div class="table-container">
                        <table class="table">
                            <thead class="thead-dark">
                              <tr>
                                <th scope="col">#</th>
                                <th scope="col">Room No</th>
                                <th scope="col">Room Name</th>
                                <th scope="col">Type</th>
                                <th scope="col">Number People</th>
                                <th scope="col">Price</th>
                                <th scope="col">Status</th>
                                <th scope="col">Action</th>
                              </tr>
                            </thead>
                            <tbody>
                              <c:forEach var="roomlist" items="${roomlist}">
	                              <tr>
	                                <td>${roomlist.id}</td>
	                                <td>${roomlist.room_no}</td>
	                                <td>${roomlist.room_name}</td>
	                                <td>${roomlist.name_type}</td>
	                                <td>${roomlist.num_people}</td>
	                                <td>${roomlist.price}</td>
	                                <td>${roomlist.status}</td>
	                                <td>
	                                    <button type="button" class="btn btn-success">Edit</button>
	                                    <button onclick="location.href='deleteroom/${roomlist.id}'" type="button" class="btn btn-danger">Delete</button>
	                                </td>
	                              </tr>
                              </c:forEach>	
                            </tbody>
                        </table>
                    </div>
                </div>
