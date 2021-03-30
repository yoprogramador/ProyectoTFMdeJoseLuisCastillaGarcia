package opcionOperacionEstadisticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DesvTipicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DesvTipicaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String datosParaDesvTipica = request.getParameter("datosParaDesvTipica");
		GrupoDeDatos objetoGrupoDeDatos = new GrupoDeDatos(datosParaDesvTipica);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOGRUPODEDATOS", objetoGrupoDeDatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoDesvTipica.jsp");
		dispatcher.forward(request, response);				

	}

}
