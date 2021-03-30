<%@page import="tablaProblemas.ProblemasDao"%>
<%@page import="tablaProblemas.TablaProblemasDatasource"%>
<%@page import="tablaProblemas.IdentificadorProblema"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Problema buscado por identificador</title>
</head>
<body>
				<%
					HttpSession httpSession7 = request.getSession();
							IdentificadorProblema objetoId =(IdentificadorProblema)httpSession7.getAttribute("OBJETOIDENTIFICADOR");
							
					TablaProblemasDatasource.makeJDBCConnection();
					
					if(TablaProblemasDatasource.comprobadorExistenciaId(objetoId.getIdentificadorProblema())){							
					ProblemasDao problema = TablaProblemasDatasource.getProblemaById(objetoId.getIdentificadorProblema());
				%>		

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
					}else{			
				%>
					<h3>No existe en la tabla un problema con ese identificador.</h3>
					<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>
					<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>
					<form action="DecisionSalirDeLaAplicacionServlet" method="post">
					�Continuar?
					<input type="text" name="decisionSalirOno" value="">
						<br><br>
		  	  		<input type="submit" value="Enviar">
					</form>				
					
				<%
					}				
				%>
					 

</body>
</html>