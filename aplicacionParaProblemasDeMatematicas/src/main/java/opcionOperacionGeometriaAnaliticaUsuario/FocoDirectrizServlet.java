package opcionOperacionGeometriaAnaliticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class FocoDirectrizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FocoDirectrizServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String valorXfoco = request.getParameter("valorXfoco");
		String valorYfoco = request.getParameter("valorYfoco");
		String terminoIndependienteDirectriz = request.getParameter("terminoIndependienteDirectriz");
		FocoDirectriz focoDirectriz = new FocoDirectriz(valorXfoco, valorYfoco, terminoIndependienteDirectriz);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("FOCODIRECTRIZ", focoDirectriz);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoCalculoFuncionCuadratica.jsp");
		dispatcher.forward(request, response);		
	}
	




}
