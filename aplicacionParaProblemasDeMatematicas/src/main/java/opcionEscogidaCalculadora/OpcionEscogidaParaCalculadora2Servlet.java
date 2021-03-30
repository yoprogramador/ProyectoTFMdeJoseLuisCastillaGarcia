package opcionEscogidaCalculadora;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class OpcionEscogidaParaCalculadora2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public OpcionEscogidaParaCalculadora2Servlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcionAreaMatematicas = request.getParameter("opcionAreaMatematicas");
		OpcionAreaMatematicas objetoAreaMatematicas = new OpcionAreaMatematicas(opcionAreaMatematicas);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOAREAMATEMATICAS", objetoAreaMatematicas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioCalculadora.jsp");
		dispatcher.forward(request, response);
	}

}
