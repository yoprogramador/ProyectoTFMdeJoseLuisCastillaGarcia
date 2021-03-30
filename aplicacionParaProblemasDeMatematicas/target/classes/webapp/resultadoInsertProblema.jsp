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
<title>Resultado introducci�n problema en tabla problemas</title>
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
					<h3>El �rea al que pertenece el problema es :&nbsp<%=problema.getAreaDelProblema() %></h3>
					<h3>El procedimiento de resoluci�n del problema es :&nbsp<%=problema.getProcedimientoResolucion() %></h3>
					<h3>La soluci�n del problema es :&nbsp<%=problema.getSolucionProblema() %></h3>
					<h3>El porcentaje de resoluci�n del problema es :&nbsp<%=problema.getPorcentajeDeResolucion() %></h3>
					<h3>El tiempo medio invertido en resolver el problema es :&nbsp<%=problema.getTiempoMedioMinutosInvertidoEnProblema() %></h3>
					
					<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>
					<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>
					<form action="DecisionSalirDeLaAplicacionServlet" method="post">
					�Continuar?
					<input type="text" name="decisionSalirOno" value="">
					<br><br>
				  	<input type="submit" value="Enviar">
					</form>
					
	<%
			}catch(SQLException exception){
				exception.printStackTrace();
	%>
					<h3>Se ha excedido el l�mite en el n�mero de caracteres introducido en alg�n campo.</h3>
					<h3>Introduzca en los siguientes casilleros la informaci�n pertinente al problema</h3>
					<form action="FormularioProblemaServlet" method="post">
					Enunciado del problema (introduzca como m�ximo 1022 caracteres incluidos espacios en blanco):<br>
					<input type="text" name="enunciadoDelProblema" value="">
					<br>
					�rea al que pertenece el problema (introducir clave A para aritm�tica, AL para �lgebra, GA para geometr�a anal�tica,
					P para proporcionalidad, GE para geometr�a euclidiana, C para combinatoria, E para estad�stica y T para trigonometr�a):<br>
					<input type="text" name="areaDelProblema" value="">
					<br>
					Descripci�n del procedimiento para resolver el problema (introduzca como m�ximo 1022 caracteres incluidos espacios en blanco):<br>
					<input type="text" name="procedimientoResolucion" value="">
					<br>
					Soluci�n del problema (introduzca como m�ximo 300 caracteres incluidos espacios en blanco):<br>
					<input type="text" name="solucionProblema" value="">
					<br>
					Porcentaje de alumnos que lo resolvieron (introduzca como m�ximo 200 caracteres incluidos espacios en blanco):<br>
					<input type="text" name="porcentajeDeResolucion" value="">
					<br>
					Tiempo medio (en minutos) invertido en resolver el problema (introduzca como m�ximo 200 caracteres incluidos espacios en blanco):<br>
					<input type="text" name="tiempoMedioMinutosInvertidoEnProblema" value="">
					<br><br>
				  	  <input type="submit" value="Enviar">
					</form>
					
	<%
				}			
		}else{
	%>
		<h3>La clave introducida para determinar el �rea al que pertenece el problema es incorrecta.</h3>
		<h3>Introduzca una clave correcta.</h3>
			<form action="FormularioProblemaServlet" method="post">
			Enunciado del problema:<br>
			<input type="text" name="enunciadoDelProblema" value="<%=problemaDao.getEnunciadoDelProblema()%>">
			<br>
			�rea al que pertenece el problema (introducir clave A para aritm�tica, AL para �lgebra, GA para geometr�a anal�tica,
			P para proporcionalidad, GE para geometr�a euclidiana, C para combinatoria, E para estad�stica y T para trigonometr�a):<br>
			<input type="text" name="areaDelProblema" value="">
			<br>
			Descripci�n del procedimiento para resolver el problema:<br>
			<input type="text" name="procedimientoResolucion" value="<%=problemaDao.getProcedimientoResolucion()%>">
			<br>
			Soluci�n del problema:<br>
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