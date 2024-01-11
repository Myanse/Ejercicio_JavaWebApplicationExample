package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String options = request.getParameter("options");

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Bienvenida</title></head>");
		out.println("<body>");
		out.println("<h1>Te damos la bienvenida!!</h1>");
		if(options.equals("1")) {
			out.print("<p>Buenos días, " + name + ".</p>");
		} else if(options.equals("2")) {
			out.print("<p>Buenas tardes, " + name + ".</p>");
		} else {
			out.print("<p>Buenas noches, " + name + ".</p>");
		}
	}
}