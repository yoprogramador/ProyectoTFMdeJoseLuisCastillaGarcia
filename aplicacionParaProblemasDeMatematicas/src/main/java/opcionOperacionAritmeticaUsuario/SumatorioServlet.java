package opcionOperacionAritmeticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SumatorioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SumatorioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sumatorio = request.getParameter("sumatorio");
		Sumatorio objetoSumatorio = new Sumatorio(sumatorio);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOSUMATORIO", objetoSumatorio);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoSumatorio.jsp");
		dispatcher.forward(request, response);				

	}

}
