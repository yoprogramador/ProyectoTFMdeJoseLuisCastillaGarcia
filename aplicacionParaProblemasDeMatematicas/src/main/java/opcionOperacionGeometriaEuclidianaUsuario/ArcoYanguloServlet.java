package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ArcoYanguloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ArcoYanguloServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String arco = request.getParameter("arco");
		String angulo = request.getParameter("angulo");
		ArcoYangulo objetoArcoYangulo = new ArcoYangulo(arco, angulo);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOARCOYANGULO", objetoArcoYangulo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoLongitudRadio.jsp");
		dispatcher.forward(request, response);		

	}

}
