<%@page import="opcionOperacionCombinatoriaUsuario.OperacionCombinatoriaUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario operaciones combinatoria</title>
</head>
<body>
	<%
		HttpSession httpSession2 = request.getSession();
			OperacionCombinatoriaUsuario objetoOperacionCombinatoria = (OperacionCombinatoriaUsuario) httpSession2.getAttribute("OBJETOOPERACIONCOMBINATORIA");
	%>
			<%
				if(objetoOperacionCombinatoria.getOperacionCombinatoria().equalsIgnoreCase("VAR")){
			%>
				<h3>Introduzca en los siguientes casilleros el valor de "n" y de "r"</h3>
				<h3>que deben ser ambos números enteros positivos</h3>
					<form action="VariacionesServlet" method="post">
			  Valor de "n":<br>
					<input type="text" name="valorN" value="">
					<br>
			  Valor de "r":<br>
					<input type="text" name="valorR" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		<%
			}else if(objetoOperacionCombinatoria.getOperacionCombinatoria().equalsIgnoreCase("COM")){
		%>
				<h3>Introduzca en los siguientes casilleros el valor de "n" y de "r"</h3>
				<h3>que deben ser ambos números enteros positivos</h3>
					<form action="CombinacionesServlet" method="post">
			  Valor de "n":<br>
					<input type="text" name="valorN" value="">
					<br>
			  Valor de "r":<br>
					<input type="text" name="valorR" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>

		<%
			}else if(objetoOperacionCombinatoria.getOperacionCombinatoria().equalsIgnoreCase("VREP")){	
		%>
				<h3>Introduzca en los siguientes casilleros el valor de "n" y de "r"</h3>
				<h3>que deben ser ambos números enteros positivos</h3>
					<form action="VariacionesRepServlet" method="post">
			  Valor de "n":<br>
					<input type="text" name="valorN" value="">
					<br>
			  Valor de "r":<br>
					<input type="text" name="valorR" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>	
		
		<%
			}else if(objetoOperacionCombinatoria.getOperacionCombinatoria().equalsIgnoreCase("CREP")){
		%>
				<h3>Introduzca en los siguientes casilleros el valor de "n" y de "r"</h3>
				<h3>que deben ser ambos números enteros positivos</h3>
					<form action="CombinacionesRepServlet" method="post">
			  Valor de "n":<br>
					<input type="text" name="valorN" value="">
					<br>
			  Valor de "r":<br>
					<input type="text" name="valorR" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>	
		
		<%
			}else if(objetoOperacionCombinatoria.getOperacionCombinatoria().equalsIgnoreCase("PREP")){
		%>
				<h3>Introduzca en el siguiente casillero el valor de "r<sub>1</sub>", de "r<sub>2</sub>",..., de "r<sub>k</sub>". Todos</h3>
				<h3>estos valores deben ser números enteros positivos. Deben de quedar separados</h3>
				<h3>por una coma sin ningún espacio en blanco, y su suma debe ser "r" que es</h3>
				<h3>el número total de elementos.</h3>
					<form action="PermutacionesRepServlet" method="post">
			  Valores de "r<sub>i</sub>":<br>
					<input type="text" name="valoresR" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>	
		
		<%
			}else if(objetoOperacionCombinatoria.getOperacionCombinatoria().equalsIgnoreCase("PER")){
		%>
				<h3>Introduzca en el siguiente casillero el valor de "r". Éste valor debe ser</h3>
				<h3>un número entero positivo.</h3>
					<form action="PermutacionesServlet" method="post">
			  Valor de "r":<br>
					<input type="text" name="valorR" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>	
		
		<%
			}
		%>
</body>
</html>