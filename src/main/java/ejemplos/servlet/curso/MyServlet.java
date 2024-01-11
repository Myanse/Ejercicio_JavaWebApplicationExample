package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Formulario</title></head>");
		out.println("<body>");
		out.println("<h1>Formulario</h1>");
		out.print("<form action=myServlet2 method=get>");
		out.print("<label for=username>Nombre de usuario:</label><br>");
		out.print("<input type=text name=username value=><br>");
		out.print("Elige un saludo:<br>");
		out.print("<select id=1 name=options>");
		out.print("<option value=1>Buenos días</option>");
		out.print("<option value=2>Buenas tardes</option>");
		out.print("<option value=3>Buenas noches</option></select><br><br>");
		out.print("<input type=submit name=Submit>");
		out.println("</form></body></html>");
	}

}