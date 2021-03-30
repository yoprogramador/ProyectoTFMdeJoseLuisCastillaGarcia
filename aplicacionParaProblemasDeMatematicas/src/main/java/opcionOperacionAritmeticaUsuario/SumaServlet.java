package opcionOperacionAritmeticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       

    public SumaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String primerSumando = request.getParameter("primerSumando");
		String segundoSumando = request.getParameter("segundoSumando");
		Suma objetoSuma = new Suma(primerSumando, segundoSumando);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOSUMA", objetoSuma);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoSuma.jsp");
		dispatcher.forward(request, response);		
	}





}
