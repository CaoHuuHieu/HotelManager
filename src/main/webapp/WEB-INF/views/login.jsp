	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
 	<div class="login_container">
 		<div class="flogin"> 
			<form action="admin/login" method="post" name="loginForm">
				<h2>Login</h2>
				<input type="text" name="username" placeholder="Enter username">
				<br>
				<br>
				<input type="password" name="password" placeholder="Enter password">
				<br>
				<br>
				<input type="submit" value="Login">	
			</form>
 		</div>
 	</div>
</body>
</html>