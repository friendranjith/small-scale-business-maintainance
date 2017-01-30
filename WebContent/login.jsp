<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%
	String errorMessage = request.getParameter("error");
%>
<html>
<head>
<link href="http://fonts.googleapis.com/icon?family=Material+Icons" type="text/css" rel="stylesheet">
<!-- CORE CSS-->
<link href="css/materialize.css" type="text/css" rel="stylesheet"
	media="screen,projection">
<link href="css/style.css" type="text/css" rel="stylesheet"
	media="screen,projection">

<!-- Custome CSS-->
<link href="css/custom-style.css" type="text/css" rel="stylesheet"
	media="screen,projection">
<!-- INCLUDED PLUGIN CSS -->
<link href="css/prism.css" type="text/css" rel="stylesheet"
	media="screen,projection">
<link href="js/plugins/perfect-scrollbar/perfect-scrollbar.css"
	type="text/css" rel="stylesheet" media="screen,projection">
<link href="js/plugins/chartist-js/chartist.min.css" type="text/css"
	rel="stylesheet" media="screen,projection">
<!-- END OF INCLUDED PLUGIN CSS -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<title>Login</title>
</head>
<body>
	<%
		if (errorMessage != null) {
	%>
	<div class="alert alert-danger text-center"
		style="position: absolute; top: 0px; z-index: 1; width: 100%;">
		<strong>Oh snap! </strong>
		<%=errorMessage%>
	</div>
	<%
		}
	%>
	<div class="login-page">
		<div class="row">
			<form class="col s12" method="POST" action="login" role="form">
				<div class="col s12 l4 offset-l4">
					<div class="row">
						<div class="input-field col s12">
							<input id="email" name="email" type="email" class="validate">
							<label for="email" class="">Email</label>
						</div>
					</div>
					<div class="row">
						<div class="input-field col s12">
							<input id="password" name="password" type="password" class="validate">
							<label for="password" class="">Password</label>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col s12 l4 offset-l4">
						<button class="btn waves-effect waves-light" type="submit" name="action">Submit
							<i class="material-icons right">send</i>
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!--Import jQuery before materialize.js-->
	<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript" src="js/materialize.js"></script>
</body>
</html>