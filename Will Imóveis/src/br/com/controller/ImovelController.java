package br.com.controller;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import br.com.bean.ImovelBean;
import br.com.bo.ImovelBO;

/**
 * Servlet implementation class ImovelController
 */
@MultipartConfig 
@WebServlet("/ImovelController")
public class ImovelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ImovelBO imovel = new ImovelBO();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImovelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ImovelBean> lista = new ArrayList<ImovelBean>();
		ImovelBO imovel = new ImovelBO();
		lista = imovel.listarImoveis();
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeImovel =  request.getParameter("nomeImovel");
		int qtd_quartos = Integer.parseInt(request.getParameter("qtd_quartos"));
		int qtd_banheiros = Integer.parseInt(request.getParameter("qtd_banheiros"));
		double area = Float.parseFloat(request.getParameter("area"));
		double valor = Float.parseFloat(request.getParameter("valor"));
		String descricao = request.getParameter("descricao");
		
		imovel.inserirImovel(nomeImovel, qtd_quartos, qtd_banheiros, area, valor, descricao);
		response.sendRedirect("index.jsp");
	}

}
