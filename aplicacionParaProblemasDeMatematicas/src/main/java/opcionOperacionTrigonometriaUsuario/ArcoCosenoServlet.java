package opcionOperacionTrigonometriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ArcoCosenoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ArcoCosenoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String coseno = request.getParameter("coseno");
		UnDato objetoUnDato = new UnDato(coseno);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOUNDATO", objetoUnDato);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoArcoCoseno.jsp");
		dispatcher.forward(request, response);		

	}

}
