<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<h1>Quản lý phòng</h1>
                <div class="main-container">
                    <div class="form-container">
                        <h5>Room Form</h5>
                        <form:form method="post" action="saveroom?thaotac=${method}">
                        	<form:hidden  path="id" /> 
                            <div class="form-input">
                                <label>Room No</label>
                                <form:input type="text" path="room_no" name="" id="" placeholder="Room No"/>
                            </div>
                            <div class="form-input">
                                <label>Room Name</label>
                                <form:input type="text" path="room_name" name="" id="" placeholder="Room Name"/>
                            </div>
                            <div class="form-input">
                                <label>Type</label>
                                <form:select path="id_roomtype">
                                 <form:option value="0" label="Chọn loại phòng"/>  
                                 <c:forEach items="${listtype}" var="listtype" >
                                 	<form:option value="${listtype.id}" label="${listtype.name}"/>  
                                 </c:forEach>
                                </form:select>
                            </div>
                            <div class="form-input">
                                <label>Number People</label>
                                <form:input type="number" path="num_people" min="0" name="" id="" placeholder="Number People"/>
                            </div>
                            <div class="form-input">
                                <label>Price</label>
                                <form:input type="number" path="price" min="0" name="" id="" placeholder="Price"/>
                            </div>
                            <div class="form-input">
                                <label>Description</label>
                                <textarea name="" id="" cols="30" rows="10"></textarea>
                            </div>
                            <button type="submit" class="submit-btn">Submit</button>
                      
                    </div>
                    <div class="form-service">
                        <h5>Tiện ích</h5>
                        
                            <div class="form-input">
                                <label for="">Tiện ích 1</label>
                                <input type="text">
                            </div>
                            <div class="form-input">
                                <label for="">Tiện ích 2</label>
                                <input type="text">
                            </div>
                            <div class="form-input">
                                <label for="">Tiện ích 3</label>
                                <input type="text">
                            </div>
                            <div class="form-input">
                                <label for="">Tiện ích 4</label>
                                <input type="text">
                            </div>
                        
	                     </form:form>
                    </div>
                </div>