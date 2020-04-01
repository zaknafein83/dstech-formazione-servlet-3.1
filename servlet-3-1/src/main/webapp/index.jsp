<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Applicazione Servlet 3.1 JakartaEE</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">

</head>
<body>
	<%@include file="header.jsp"%>

	<div class="container">
		<div class="row">
			<div class="col-1">
				<%@include file="left_menu.jsp"%>
			</div>
			<div class="col">
				<form action="index" method="get">
					<input type="text" name="username" /> <input type="password"
						name="password" />
					<button>Login</button>
				</form>
			</div>
		</div>
	</div>

	<%@include file="footer.jsp"%>

</body>
</html>