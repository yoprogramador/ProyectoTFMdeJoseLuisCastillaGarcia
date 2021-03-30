<%@page import="tablaProblemas.ClaveTablaProblemas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Introducci�n problema en tabla problemas</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		ClaveTablaProblemas objetoClave = (ClaveTablaProblemas) httpSession3.getAttribute("OBJETOCLAVE");
	%>
	
		<%
			if(objetoClave.getClaveTablaProblemas().equals("29080665V")){
		%>
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
			}else{
		%>
			<h3>Clave introducida incorrecta</h3>
			<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>
			<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>
			<form action="DecisionSalirDeLaAplicacionServlet" method="post">
			�Continuar?<br>
			<input type="text" name="decisionSalirOno" value="">
			<br><br>
			</form>
		<%	
			}
		%>	

</body>
</html>