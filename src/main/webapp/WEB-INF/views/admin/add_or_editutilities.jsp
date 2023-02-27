<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<div class="add-new-container">
                    <h5>Add or Edit Utilities</h5>
                    <div class="add-new">
                        <form:form method="post" action="saveutilities?thaotac=${method}">
                        	<form:hidden  path="id"/>
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
                </div>