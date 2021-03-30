package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DosAngulosTrianguloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DosAngulosTrianguloServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String angulo1 = request.getParameter("angulo1");
		String angulo2 = request.getParameter("angulo2");
		DosAngulosTriangulo objeto2angulosTriangulo = new DosAngulosTriangulo(angulo1, angulo2);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETO2ANGULOSTRIANGULO", objeto2angulosTriangulo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAnguloTriangulo.jsp");
		dispatcher.forward(request, response);		
		
	}

}
