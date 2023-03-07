<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Quản lý phòng</h1>
<div class="main-container">
	<div class="form-container">
		<form:form method="GET" action="saveroom?thaotac=${method}">
			
			<div class="form-input">
				<form:select multiple="true" path="imageEntities">
	   				 <form:options items="${listimage}" itemValue="id" itemLabel="name"/>
				</form:select>
			</div>
			<button type="submit" class="submit-btn">Submit</button>
	</form:form>
</div>
</div>