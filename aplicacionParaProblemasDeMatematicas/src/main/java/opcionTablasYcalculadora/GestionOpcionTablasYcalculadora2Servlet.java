package opcionTablasYcalculadora;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;






public class GestionOpcionTablasYcalculadora2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GestionOpcionTablasYcalculadora2Servlet() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcionTablasYcalculadora = request.getParameter("opcionTablasYcalculadora");
		OpcionTablasYcalculadora objetoOpcTablasYcalc = new OpcionTablasYcalculadora(opcionTablasYcalculadora);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOOPCTABLASYCALC", objetoOpcTablasYcalc);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioOpcionTablasYcalculadora2.jsp");
		dispatcher.forward(request, response);
	}
	

}
