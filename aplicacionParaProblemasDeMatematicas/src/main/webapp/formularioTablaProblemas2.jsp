<%@page import="tablaProblemas.ClaveTablaProblemas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Introducción problema en tabla problemas</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		ClaveTablaProblemas objetoClave = (ClaveTablaProblemas) httpSession3.getAttribute("OBJETOCLAVE");
	%>
	
		<%
			if(objetoClave.getClaveTablaProblemas().equals("29080665V")){
		%>
			<h3>Introduzca en los siguientes casilleros la información pertinente al problema</h3>
			<form action="FormularioProblemaServlet" method="post">
			Enunciado del problema (introduzca como máximo 1022 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="enunciadoDelProblema" value="">
			<br>
			Área al que pertenece el problema (introducir clave A para aritmética, AL para álgebra, GA para geometría analítica,
			P para proporcionalidad, GE para geometría euclidiana, C para combinatoria, E para estadística y T para trigonometría):<br>
			<input type="text" name="areaDelProblema" value="">
			<br>
			Descripción del procedimiento para resolver el problema (introduzca como máximo 1022 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="procedimientoResolucion" value="">
			<br>
			Solución del problema (introduzca como máximo 300 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="solucionProblema" value="">
			<br>
			Porcentaje de alumnos que lo resolvieron (introduzca como máximo 200 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="porcentajeDeResolucion" value="">
			<br>
			Tiempo medio (en minutos) invertido en resolver el problema (introduzca como máximo 200 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="tiempoMedioMinutosInvertidoEnProblema" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>

		<%
			}else{
		%>
			<h3>Clave introducida incorrecta</h3>
			<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>
			<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>
			<form action="DecisionSalirDeLaAplicacionServlet" method="post">
			¿Continuar?<br>
			<input type="text" name="decisionSalirOno" value="">
			<br><br>
			</form>
		<%	
			}
		%>	

</body>
</html>