package opcionOperacionAritmeticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MultiplicacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MultiplicacionServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String primerFactor = request.getParameter("primerFactor");
		String segundoFactor = request.getParameter("segundoFactor");
		Multiplicacion objetoMultiplicacion = new Multiplicacion(primerFactor, segundoFactor);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOMULTIPLICACION", objetoMultiplicacion);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoMultiplic.jsp");
		dispatcher.forward(request, response);		
	}



}
