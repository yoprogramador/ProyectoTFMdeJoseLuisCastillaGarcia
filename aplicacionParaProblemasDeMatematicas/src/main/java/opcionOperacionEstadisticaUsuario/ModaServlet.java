package opcionOperacionEstadisticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ModaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ModaServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String datosParaModa = request.getParameter("datosParaModa");
		GrupoDeDatos objetoGrupoDeDatos = new GrupoDeDatos(datosParaModa);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOGRUPODEDATOS", objetoGrupoDeDatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoModa.jsp");
		dispatcher.forward(request, response);				

	}

}
