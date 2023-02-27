<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html lang="en">
  <head>
  	<meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="<c:url value="/assets/user/css/user.css"/>" />
    <script src="<c:url value="/assets/user/js/main.js"/>"></script>
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
    />
    <title>Document</title>
  </head>
	<body>
	
	
	
	
		<%@ include file = "/WEB-INF/views/layouts/user/header.jsp" %>

		
        	<decorator:body />
  		<%@ include file = "/WEB-INF/views/layouts/user/footer.jsp" %>
  
  
  
  
  
	</body>	 
</html>
    