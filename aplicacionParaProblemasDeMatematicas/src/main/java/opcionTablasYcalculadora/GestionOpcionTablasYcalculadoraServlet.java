package opcionTablasYcalculadora;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class GestionOpcionTablasYcalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GestionOpcionTablasYcalculadoraServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioOpcionTablasYcalculadora.jsp");
        dispatcher.forward(request, response);
	}




}
