package sp.senai.br.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import sp.senai.br.dao.ClientesDao;
import sp.senai.br.model.Cliente;

@WebServlet("/listaclientes")
public class ListaClientes extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClientesDao clientesDao = new ClientesDao();
		List<Cliente> lista = clientesDao.listarCliente();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listaclientes.jsp");
		request.setAttribute("lista", lista);
		dispatcher.forward(request, response);
	}
}
