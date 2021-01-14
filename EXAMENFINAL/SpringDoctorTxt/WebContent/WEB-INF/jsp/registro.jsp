<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
							<form:form method="post" modelAttribute="doctor">
								<div class="form-group">
									<label>Nombre:*</label>
									<form:input path="nombre" type="text" class="form-control"
										name="nombre" placeholder="Ingresa tu nombre" />
									<form:errors path="nombre" cssClass="error" />
								</div>
								<div class="form-group">
									<label>Apellidos:*</label>
									<form:input path="apellidos" type="text" name="apellidos"
										class="form-control" placeholder="Ingresa tus apellidos" />
									<form:errors path="apellidos" cssClass="error" />
								</div>
								<div class="form-group">
									<label>Direccion:*</label>
									<form:input path="direccion" type="text" name="direccion"
										class="form-control" placeholder="Ingresa tu dirección" />
									<form:errors path="direccion" cssClass="error" />
								</div>
								<div class="form-group">
									<label>Teléfono:*</label>
									<form:input path="telefono" type="number" name="telefono"
										class="form-control" placeholder="Ingresa tu teléfono" />
									<form:errors path="telefono" cssClass="error" />
								</div>
								<div class="form-group">
									<label>RFC:*</label>
									<form:input path="rfc" type="text" name="rfc"
										class="form-control" placeholder="Ingresa tus rfc" />
									<form:errors path="rfc" cssClass="error" />
								</div>
								<div class="form-group">
									<label>Especialidad:*</label>
									<form:input path="especialidad" type="text" name="especialidad"
										class="form-control" placeholder="Ingresa tu especialidad" />
									<form:errors path="especialidad" cssClass="error" />
								</div>
								<div class="form-group">
									<label>Sexo:*</label> </br>
									<form:radiobutton path="sexo" value="Hombre" />
									Hombre <br>
									<form:radiobutton path="sexo" value="Mujer" />
									Mujer <br>
									<form:errors path="sexo" cssClass="error" />
								</div>
								<div class="form-group">
									<label>Correo:*</label>
									<form:input path="correo" type="email" name="correo"
										class="form-control" placeholder="Ingresa tu correo" />
									<form:errors path="correo" cssClass="error" />
								</div>
								<div class="form-group">
									<label>Contraseña:*</label>
									<form:input path="contra" type="text" name="contra"
										class="form-control" placeholder="Ingresatucontraseña" />
									<form:errors path="contra" cssClass="error" />
								</div>
								<br />
								<button type="submit" class="btn btn-primary col-md-2 ">Registrar</button>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>