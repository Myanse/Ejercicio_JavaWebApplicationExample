<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bienvenida</title>
</head>
<body>
    <h1>Te damos la bienvenida!!</h1>
    <%
        String name = request.getParameter("username");
        String options = request.getParameter("options");

        if(options.equals("1")) {
            out.print("<p>Buenos días, " + name + ".</p>");
        } else if(options.equals("2")) {
        	out.print("<p>Buenas tardes, " + name + ".</p>");
        } else {
        	out.print("<p>Buenas noches, " + name + ".</p>");
        }
    %>
</body>
</html>