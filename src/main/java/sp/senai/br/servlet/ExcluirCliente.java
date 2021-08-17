package sp.senai.br.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sp.senai.br.dao.ClientesDao;

@WebServlet("/excluircliente")
public class ExcluirCliente extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String txtId = request.getParameter("txtId");
		int id = Integer.parseInt(txtId);
		
		ClientesDao clientes = new ClientesDao();
		clientes.excluirCliente(id);
		response.sendRedirect("/ClientesJSP-FINAL/listaclientes");
	}
}
