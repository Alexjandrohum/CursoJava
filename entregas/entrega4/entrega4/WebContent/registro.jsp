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
	<div id="detailsUser">
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="card">
						<div class="card-header">Agregar Doctor</div>
						<div class="card-body">
							<form action="http://localhost:8081/WebDoc/registro"
								method="get">
								<div class="form-group">
									<label>Nombre:*</label> <input type="text" class="form-control"
										name="nombre" placeholder="Ingresa tu nombre" required>
								</div>
								<div class="form-group">
									<label>Apellidos:*</label> <input type="text" name="apellidos"
										class="form-control" placeholder="Ingresa tus apellidos"
										required>
								</div>
								<div class="form-group">
									<label>Direccion:*</label> <input type="text" name="direccion"
										class="form-control" placeholder="Ingresa tu dirección"
										required>
								</div>
								<div class="form-group">
									<label>Teléfono:*</label> <input type="number" name="telefono"
										class="form-control" placeholder="Ingresa tu teléfono"
										required>
								</div>
								<div class="form-group">
									<label>RFC:*</label> <input type="text" name="rfc"
										class="form-control" placeholder="Ingresa tus rfc" required>
								</div>
								<div class="form-group">
									<label>Especialidad:*</label> <input type="text"
										name="especialidad" class="form-control"
										placeholder="Ingresa tu especialidad" required>
								</div>
								<div class="form-group">
									<label>Sexo:*</label> </br>
									<input type="radio" name="sexo" value="1">Hombre <br>
									<input type="radio" name="sexo" value="2">Mujer <br>
								</div>
								<div class="form-group">
									<label>Correo:*</label> <input type="email" name="correo"
										class="form-control" placeholder="Ingresa tu correo" required>
								</div>
								<div class="form-group">
									<label>Contraseña:*</label> <input type="text" name="contra"
										class="form-control placeholder="
										Ingresatucontraseña" required>
								</div>
								<div class="form-group">
									<label>Confirmar contraseña:*</label> <input type="text"
										name="confir" class="form-control placeholder=" Ingresa
										tucontraseñaotravez" required>
								</div>
								<br />
								<button type="submit" class="btn btn-primary col-md-2 ">Registrar</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>