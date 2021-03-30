package opcionOperacionGeometriaAnaliticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class FuncionCuadraticaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FuncionCuadraticaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String coeficienteA = request.getParameter("coeficienteA");
		String coeficienteB = request.getParameter("coeficienteB");
		String terminoIndependienteC = request.getParameter("terminoIndependienteC");
		FuncionCuadratica funcionCuadratica  = new FuncionCuadratica(coeficienteA, coeficienteB, terminoIndependienteC);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("FUNCIONCUADRATICA", funcionCuadratica);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoVerticeYpuntCortX.jsp");
		dispatcher.forward(request, response);		
	}




}
