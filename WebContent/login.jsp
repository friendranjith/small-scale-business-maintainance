<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%String errorMessage = request.getParameter("error");
%>
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link href="http://rawgit.com/start-angular/SB-Admin-BS4-Angular-2/master/dist/prod/css/main.css?1474828306494" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<%if(errorMessage != null){%>
	<div class="alert alert-danger text-center" style="position: absolute;top: 0px;z-index: 1;width: 100%;">
		<strong>Oh snap! </strong> <%=errorMessage%>
	</div>
	<%}%>
	<div class="login-page">
		<div class="row">
			<div class="col-lg-4 col-lg-offset-4">  
				<img class="user-avatar" src="image/login_icon.png" width="150px">
				<h1>Product Maintainance</h1>
				<form role="form" method="POST" action="login">
					<div class="form-content">
						<div class="form-group">
							<input name="email" class="form-control input-underline input-lg" id="" placeholder="Email" type="text"> 					
						</div>
						<div class="form-group">
							<input name="password" class="form-control input-underline input-lg" id="" placeholder="Password" type="password"> 					
						</div>
					</div>
					<button type="submit" class="btn rounded-btn"> Log in </a>&nbsp;
					<a class="btn rounded-btn" href="/register">Register</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>