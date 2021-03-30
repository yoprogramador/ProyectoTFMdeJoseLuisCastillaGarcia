package opcionOperacionTrigonometriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SenoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SenoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String angulo = request.getParameter("angulo");
		UnDato objetoUnDato = new UnDato(angulo);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOUNDATO", objetoUnDato);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoSeno.jsp");
		dispatcher.forward(request, response);		

	}

}
