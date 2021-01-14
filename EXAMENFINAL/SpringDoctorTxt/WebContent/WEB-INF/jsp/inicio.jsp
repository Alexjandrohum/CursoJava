<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

	<div class="container">
		<h1>Bienvenido</h1>
		<div class="media">
			<img class="mr-3"
				src="https://www.flaticon.es/premium-icon/icons/svg/2377/2377962.svg"
				alt="" width="70" height="70">
			<div class="media-body">
				<h5 class="mt-0">Dr. ${doctor.nombre}</h5>
				<p>Fecha: ${fecha}</p>
				Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
				scelerisque ante sollicitudin. Cras purus odio, vestibulum in
				vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi
				vulputate fringilla. Donec lacinia congue felis in faucibus.
			</div>
		</div>
		<br>

	</div>
	</br>
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="card">
					<label class="mr-sm-5" for="inlineFormCustomSelect">
						${mensajes}</label>
					<div class="card-header">Crear horario</div>
					<div class="card_body">
						<form:form method="post" modelAttribute="horario">
							<div class="container">
								<div class="form-row align-items-center">
									<div class="col-auto my-1">
										<label class="mr-sm-5" for="inlineFormCustomSelect">Semanas</label>
										<form:select path="semana" class="custom-select mr-sm-5">
											<form:option value="selected">Selecciona</form:option>
											<c:forEach items="${semanas2}" var="semana">
												<form:option value="${semana.id }">${semana.nombre}</form:option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</div>
							<div class="container">
								<label class="font-weight-bold">Lunes</label>
								<form:input path="diaLunes" value="lunes" type="hidden" />
								<div class="row">
						 			<div class="col">
										<div class="form-group row">
											<label name="diaLunes" for="inicioLunes"
												class="col-sm-5 col-form-label">Hora inicial</label>
											<div class="col-sm-4">
												<form:input path="inicioL" type="text" class="form-control"
													name="inicioL" placeholder="0" />
											</div>
										</div>
									</div>
									<div class="col">
										<div class="form-group row">
											<label for="finalLunes" class="col-sm-5 col-form-label">Hora
												final</label>
											<div class="col-sm-4">
												<form:input path="terminoL" type="text" class="form-control"
													placeholder="0" />
											</div>
										</div>
									</div>
								</div>
								<label class="font-weight-bold">Martes</label>
								<form:input path="diaMartes" value="martes" type="hidden" />
								<div class="row">
									<div class="col">
										<div class="form-group row">
											<label for="inicioLunes" class="col-sm-5 col-form-label">Hora
												inicial</label>
											<div class="col-sm-4">
												<form:input path="inicioM" type="text" class="form-control"
													placeholder="0" />
											</div>
										</div>
									</div>
									<div class="col">
										<div class="form-group row">
											<label for="finalLunes" class="col-sm-5 col-form-label">Hora
												final</label>
											<div class="col-sm-4">
												<form:input path="terminoM" type="text" class="form-control"
													name="finalLunes" placeholder="0" />
											</div>
										</div>
									</div>
								</div>
								<label class="font-weight-bold">Miercoles</label>
								<form:input path="diaMiercoles" value="miercoles" type="hidden" />
								<div class="row">
									<div class="col">
										<div class="form-group row">
											<label for="inicioLunes" class="col-sm-5 col-form-label">Hora
												inicial</label>
											<div class="col-sm-4">
												<form:input path="inicioMie" type="text"
													class="form-control" name="inicioLunes" placeholder="0" />
											</div>
										</div>
									</div>
									<div class="col">
										<div class="form-group row">
											<label for="finalLunes" class="col-sm-5 col-form-label">Hora
												final</label>
											<div class="col-sm-4">
												<form:input path="terminoMie" type="text"
													class="form-control" name="finalLunes" placeholder="0" />
											</div>
										</div>
									</div>
								</div>
								<label class="font-weight-bold">Jueves</label>
								<form:input path="diaJueves" value="jueves" type="hidden" />
								<div class="row">
									<div class="col">
										<div class="form-group row">
											<label for="inicioLunes" class="col-sm-5 col-form-label">Hora
												inicial</label>
											<div class="col-sm-4">
												<form:input path="inicioJ" type="text" class="form-control"
													name="inicioLunes" placeholder="0" />
											</div>
										</div>
									</div>
									<div class="col">
										<div class="form-group row">
											<label for="finalLunes" class="col-sm-5 col-form-label">Hora
												final</label>
											<div class="col-sm-4">
												<form:input path="terminoJ" type="text" class="form-control"
													name="finalLunes" placeholder="0" />
											</div>
										</div>
									</div>
								</div>
								<label class="font-weight-bold">Viernes</label>
								<form:input path="diaviernes" value="viernes" type="hidden" />
								<div class="row">
									<div class="col">
										<div class="form-group row">
											<label for="inicioLunes" class="col-sm-5 col-form-label">Hora
												inicial</label>
											<div class="col-sm-4">
												<form:input path="inicioV" type="text" class="form-control"
													name="inicioLunes" placeholder="0" />
											</div>
										</div>
									</div>
									<div class="col">
										<div class="form-group row">
											<label for="finalLunes" class="col-sm-5 col-form-label">Hora
												final</label>
											<div class="col-sm-4">
												<form:input path="terminoV" type="text" class="form-control"
													name="finalLunes" placeholder="0" />
											</div>
										</div>
									</div>
								</div>
							</div>
							<button type="submit" class="btn btn-primary btn-lg btn-block">Crear
								Horario</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	</br>
	</br>
</body>
</html>