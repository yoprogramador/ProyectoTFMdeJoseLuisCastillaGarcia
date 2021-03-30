<%@page import="java.util.List"%>
<%@page import="java.sql.SQLException"%>
<%@page import="tablaProblemas.TablaProblemasDatasource"%>
<%@page import="tablaProblemas.ProblemasDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado introducción problema en tabla problemas</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		ProblemasDao problemaDao = (ProblemasDao) httpSession3.getAttribute("OBJETOPROBLEMA");
		
		if(problemaDao.getAreaDelProblema().equalsIgnoreCase("A")||problemaDao.getAreaDelProblema().equalsIgnoreCase("AL")|| problemaDao.getAreaDelProblema().equalsIgnoreCase("GA")||problemaDao.getAreaDelProblema().equalsIgnoreCase("P")
			||problemaDao.getAreaDelProblema().equals("GE")||problemaDao.getAreaDelProblema().equalsIgnoreCase("C")||problemaDao.getAreaDelProblema().equalsIgnoreCase("E")||problemaDao.getAreaDelProblema().equalsIgnoreCase("T")){
		
			TablaProblemasDatasource.makeJDBCConnection();
			
			try{
				TablaProblemasDatasource.addDataToDB(problemaDao);
				ProblemasDao problema = TablaProblemasDatasource.getProblemaByLastId();
	%>
					<h3>Problema introducido en la tabla de problemas</h3>
					<h3>El identificador del problema es :&nbsp <%=problema.getId() %></h3>
					<h3>El enunciado del problema es :&nbsp <%=problema.getEnunciadoDelProblema() %></h3>
					<h3>El área al que pertenece el problema es :&nbsp<%=problema.getAreaDelProblema() %></h3>
					<h3>El procedimiento de resolución del problema es :&nbsp<%=problema.getProcedimientoResolucion() %></h3>
					<h3>La solución del problema es :&nbsp<%=problema.getSolucionProblema() %></h3>
					<h3>El porcentaje de resolución del problema es :&nbsp<%=problema.getPorcentajeDeResolucion() %></h3>
					<h3>El tiempo medio invertido en resolver el problema es :&nbsp<%=problema.getTiempoMedioMinutosInvertidoEnProblema() %></h3>
					
					<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>
					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>
					<form action="DecisionSalirDeLaAplicacionServlet" method="post">
					¿Continuar?
					<input type="text" name="decisionSalirOno" value="">
					<br><br>
				  	<input type="submit" value="Enviar">
					</form>
					
	<%
			}catch(SQLException exception){
				exception.printStackTrace();
	%>
					<h3>Se ha excedido el límite en el número de caracteres introducido en algún campo.</h3>
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
				}			
		}else{
	%>
		<h3>La clave introducida para determinar el área al que pertenece el problema es incorrecta.</h3>
		<h3>Introduzca una clave correcta.</h3>
			<form action="FormularioProblemaServlet" method="post">
			Enunciado del problema:<br>
			<input type="text" name="enunciadoDelProblema" value="<%=problemaDao.getEnunciadoDelProblema()%>">
			<br>
			Área al que pertenece el problema (introducir clave A para aritmética, AL para álgebra, GA para geometría analítica,
			P para proporcionalidad, GE para geometría euclidiana, C para combinatoria, E para estadística y T para trigonometría):<br>
			<input type="text" name="areaDelProblema" value="">
			<br>
			Descripción del procedimiento para resolver el problema:<br>
			<input type="text" name="procedimientoResolucion" value="<%=problemaDao.getProcedimientoResolucion()%>">
			<br>
			Solución del problema:<br>
			<input type="text" name="solucionProblema" value="<%=problemaDao.getSolucionProblema()%>">
			<br>
			Porcentaje de alumnos que lo resolvieron:<br>
			<input type="text" name="porcentajeDeResolucion" value="<%=problemaDao.getPorcentajeDeResolucion()%>">
			<br>
			Tiempo medio (en minutos) invertido en resolver el problema:<br>
			<input type="text" name="tiempoMedioMinutosInvertidoEnProblema" value="<%=problemaDao.getTiempoMedioMinutosInvertidoEnProblema()%>">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>	
	
	<%	
		}
	%>
		

</body>
</html>