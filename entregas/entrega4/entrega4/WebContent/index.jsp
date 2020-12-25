<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.15.1/css/all.css"
	integrity="sha384-vp86vTRFVJgpjF9jiIGPEEqYqlDwgyBgEF109VFjmqGmIY/Y4HV4d3Gp2irVfcrp"
	crossorigin="anonymous" />
<!-- jQuery and JS bundle w/ Popper.js -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
	crossorigin="anonymous"></script>

</head>
<body>
	<div class="container p-4 ">
		<div class="row justify-content-md-center col align-self-center">
			<form action="http://localhost:8081/WebDoc/bienvenida"
				class="border bg-secondary text-white" style="padding: 10%">
				<h1 style="text-align: center">Inicio de sesión</h1>
				<br />
				<div class="form-group">
					<label for="exampleInputEmail1">Correo electrónico</label> <input
						type="email" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" name="usuario">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Contraseña</label> <input
						type="password" class="form-control" id="exampleInputPassword1"
						name="password">
				</div>
				<div class="form-group form-check">
					<input type="checkbox" class="form-check-input" id="exampleCheck1">
					<label class="form-check-label" for="exampleCheck1">Check
						me out</label>
				</div>
				<button class="btn btn-primary" type="submit">Iniciar
					sesion</button>
				<br /> <br /> <a href="http://localhost:8081/WebDoc/formulario"
					style="color: white; text-align: center">Registrase</a>
			</form>
		</div>
	</div>
</body>
</html>