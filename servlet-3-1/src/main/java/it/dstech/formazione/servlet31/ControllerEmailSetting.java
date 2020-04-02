package it.dstech.formazione.servlet31;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.formazione.servlet31.utility.EmailUtility;

@WebServlet("/EmailSendingServlet")
public class ControllerEmailSetting extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// reads form fields
		String indirizzo = request.getParameter("indirizzo");
		String soggetto = request.getParameter("soggetto");
		String contenuto = request.getParameter("contenuto");
		String risultatoMessaggio = "";

		try {
			EmailUtility.sendEmail(indirizzo, soggetto, contenuto);
			risultatoMessaggio = "Mail inviata correttamente";
		} catch (Exception ex) {
			ex.printStackTrace();
			risultatoMessaggio = "C'è stato un errore nell'invio della mail: " + ex.getMessage();
		} finally {
			request.setAttribute("Message", risultatoMessaggio);
			getServletContext().getRequestDispatcher("/esito.jsp").forward(request, response);
		}
	}
}
