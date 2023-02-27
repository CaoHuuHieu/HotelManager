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
                    <h5>Add or Edit Service</h5>
                    <div class="add-new">
                        <form:form method="post" action="saveservice?thaotac=${method}">
                        	<form:hidden  path="id"/>
                        	<div class="form-input">
                                <label>Title: </label>
                                <form:input type="text" path="title" placeholder="Enter title"/>
                            </div>
                            <div class="form-input">
                                <label>Price: </label>
                                <form:input type="text" path="price" placeholder="Enter price"/>
                            </div>
                            <div class="form-input">
                                <label>Amount: </label>
                                <form:input type="text" path="amount" placeholder="Enter amount"/>
                            </div>
                            <div class="form-input">
                                <label>Category: </label>
                                <form:select path="category.id">
                                	<form:option value="0" label="Chọn danh mục"/>  
                                 		<c:forEach items="${listcategory}" var="listcategory" >
                                 	<form:option value="${listcategory.id}" label="${listcategory.name}"/>  
                                 </c:forEach>
                                </form:select>
                                
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
                </div>
</body>
</html>