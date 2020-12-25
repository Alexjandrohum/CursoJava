<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" import="model.Doctor, model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
		<div class=" col align-self-center">

			<H1>Bienvenido</H1>
			<h8>Fecha: <%out.println(request.getAttribute("fecha"));%></h8>
			</br>
			</br>
			<ul>
				<li type="circle">Nombre: <%
					Doctor doctor = (Doctor) request.getAttribute("doctor");
					out.println(doctor.getNombre());
				%>
				</li>
				<li type="circle">Apellidos: <%
					out.println(doctor.getApellidos());
				%>
				</li>
				<li type="circle">Dirección: <%
					out.println(doctor.getDireccion());
				%></li>
				<li type="circle">Especialidad: <%
					out.println(doctor.getEspecialidad());
				%>
				</li>
				<li type="circle">Telefono: <%
					out.println(doctor.getTelfono());
				%></li>
				<li type="circle">Sexo:: <%
					out.println(doctor.getSexo());
				%>
				</li>
			</ul>

			<br /> <br /> <a href="http://localhost:8081/WebDoc/index.jsp"
				style="color: black; text-align: center">Regresar</a>

		</div>
	</div>



</body>
</html>