package opcionEscogidaCalculadora;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OpcionEscogidaParaCalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public OpcionEscogidaParaCalculadoraServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioAreas.jsp");
		dispatcher.forward(request, response);
	}




}
