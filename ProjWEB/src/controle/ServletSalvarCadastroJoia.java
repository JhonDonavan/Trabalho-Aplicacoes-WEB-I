package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.JoiaDao;
import modelo.dominio.Joia;

/**
 * Servlet implementation class ServletSalvarCadastroJoia
 */
@WebServlet("/SalvarCadastroJoia")
public class ServletSalvarCadastroJoia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSalvarCadastroJoia() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendError(403, "NÃO É POSSIVEL ACESSAR VIA METODO GET!");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		String preco = request.getParameter("preco");
		String tipo = request.getParameter("tipo");
		String genero = request.getParameter("genero");
		String quantidade = request.getParameter("quantidade");
		
		//Conversão de tipos de dados. Como só recebemos dados em String
		//alguns dados é precisao converter novamente e passar os novos dados
		//como parametro ao instanciar o objeto
		int id2 = ParseInteger("id");
		float preco2 = ParseFloat("preco");
		int qtd = ParseInteger("qtd");
		
		
		Joia joia = new Joia(id2, preco2, tipo, genero, qtd);
		
		boolean dadosOK;
		String pagina = null;
		String mensagem = null;
		
		//Criar validações AQUI!!!
		
		// // 
		// //
		
		// //
		//Criar validações AQUI!!!
		
		
		JoiaDao joiadao = new JoiaDao();
		pagina = "confirmacaoJoia.jsp";
		
		//guardarObjeto no reques para ser lido pela pagina
		request.setAttribute("joia", joia);
		request.setAttribute("mensagem", mensagem);
		
		//criar despachante para chamar a pagina jsp
		RequestDispatcher disp = request.getRequestDispatcher(pagina);
		
		//executar forwar para a pagina
		disp.forward(request, response);
		
		
		
		
		
		
		
	}

	private float ParseFloat(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int ParseInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
