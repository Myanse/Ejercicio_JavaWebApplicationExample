<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
</head>
<body>
    <h1>Formulario</h1>
    <form action=myServlet method=get>
		<label for="username">Nombre de usuario:</label><br>
		<input type="text" name="username" value=""><br>
		Elige un saludo:<br>
		<select name="options">
		    <option value="1" selected>Buenos días</option>
		    <option value="2">Buenas tardes</option>
		    <option value="3">Buenas noches</option>
		</select><br><br>
		<input type="submit" name="Submit">
	</form>
</body>
</html>