package it.dstech.formazione.servlet31;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "esempio", urlPatterns = { "/", "/index" }, initParams = {
		@WebInitParam(name = "username", value = "franksisca"), @WebInitParam(name = "password", value = "123") })
public class ControllerExampleGet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream outputStream = resp.getOutputStream();
		outputStream.println("<html>");
		outputStream.println("<body>");
		outputStream.println("ecco una servlet 3.1");
		String usernameParameter = req.getParameter("username");
		String passwordParameter = req.getParameter("password");
		if (usernameParameter == null || "".equals(usernameParameter.trim())) {
			usernameParameter = getInitParameter("username");
		}

		if (passwordParameter == null || "".equals(passwordParameter.trim())) {
			passwordParameter = getInitParameter("password");
		}
		outputStream.println("Username = " + usernameParameter);
		outputStream.println("Password = " + passwordParameter);
		
		Properties properties = new Properties();
		properties.load(getServletContext().getResourceAsStream("/WEB-INF/file.properties"));

		String prop= properties.getProperty("nome.chiave");
		
		String menuLeft = properties.getProperty("menu.left");

		outputStream.println(prop);
		String[] split = menuLeft.split("\\|");
		outputStream.println("<ul>");
		for (String string : split) {
			outputStream.println("<li>"+ string+"</li>");
			
		}
		outputStream.println("</ul>");
		
		outputStream.println("</body>");
		outputStream.println("</html>");
		

	}


}
