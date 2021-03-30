package opcionOperacionTrigonometriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AreaPolRegConLongLadoYnumLadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AreaPolRegConLongLadoYnumLadosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String longitudLado = request.getParameter("longitudLado");		
		String numeroLados = request.getParameter("numeroLados");
		DosDatos objetoDosDatos = new DosDatos(longitudLado, numeroLados);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETODOSDATOS", objetoDosDatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAreaPolRegConLongLadoYnumLados.jsp");
		dispatcher.forward(request, response);

	}

}
