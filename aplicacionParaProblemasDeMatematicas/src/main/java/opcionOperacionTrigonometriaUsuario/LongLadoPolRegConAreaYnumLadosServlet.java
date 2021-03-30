package opcionOperacionTrigonometriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LongLadoPolRegConAreaYnumLadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LongLadoPolRegConAreaYnumLadosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String area = request.getParameter("area");		
		String numeroLados = request.getParameter("numeroLados");
		DosDatos objetoDosDatos = new DosDatos(area, numeroLados);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETODOSDATOS", objetoDosDatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoLongLadoPolRegConAreaYnumLados.jsp");
		dispatcher.forward(request, response);

	}

}
