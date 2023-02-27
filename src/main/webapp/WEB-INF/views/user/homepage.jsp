<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>Nội dung chính của người dùng</div>
	
	<select name="" id="">
	 		<c:set var = "salary" scope = "session" value = "2"/>
              <option value="0">Tìm theo trạng thái</option>
              <option  value="0">Chưa xác nhận</option>
              <option value="0">Chưa thanh toán</option>
              <option value="0">Đã thanh toán</option>
            </select>
</body>
</html>