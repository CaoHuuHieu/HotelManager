<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="add-new-container">
                    <h5>Add or Edit Users</h5>
                    <div class="add-new">
                        <form:form method="post" action="saveusers?thaotac=${method}">
                        	<form:hidden  path="id"/>
                        	<div class="form-input">
                                <label>Username: </label>
                                <form:input type="text" path="username" placeholder="Enter username"/>
                            </div>
                            <div class="form-input">
                                <label>Password: </label>
                                <form:input type="text" path="password" placeholder="Enter password"/>
                            </div>
                            <div class="form-input">
                                <label>Full Name: </label>
                                <form:input type="text" path="fullname" placeholder="Enter fullname"/>
                            </div>
                            <div class="form-input">
                                <label>Birthday: </label>
                                <form:input type="date" path="birthday"/>
                            </div>
                            <div class="form-input">
                                <label>Createday: </label>
                                <form:input type="date" path="createday"/>
                            </div>
                            <div class="form-input">
                                <label>Gender: </label>
                                Male<form:radiobutton path="gender" value="Male"/>
                                Female<form:radiobutton path="gender" value="Female"/>
                                Other<form:radiobutton path="gender" value="Other"/>
                            </div>
                            <div class="form-input">
                                <label>Phone Number: </label>
                                <form:input type="text" path="phone_number" placeholder="Enter phonenumber"/>
                            </div>
                            <div class="form-input">
                                <label>Address: </label>
                                <form:input type="text" path="address" placeholder="Enter address"/>
                            </div>
                            <div class="form-input">
                                <label>Role: </label>
                                <form:input type="text" path="role.id" placeholder="Enter role"/>
                            </div>
                            <button type="submit" class="save">Save</button>
                        </form:form>
                    </div>
                </div>
</body>
</html>