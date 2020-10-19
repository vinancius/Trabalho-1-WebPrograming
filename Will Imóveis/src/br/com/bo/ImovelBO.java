package br.com.bo;

import java.util.ArrayList;

import br.com.bean.ImovelBean;
import br.com.dao.ImovelDAO;


public class ImovelBO {
	ImovelDAO imovelDAO = new ImovelDAO();
	
	public ArrayList<ImovelBean> listarImoveis() {
		ImovelDAO imovel = new ImovelDAO();
		return imovel.listarImoveis();
		
	}
	
	
	public boolean inserirImovel(String imagem, int qtd_quartos, int qtd_banheiros, double area, double valor, String descricao) {
		ImovelBean imovel = new ImovelBean(imagem,qtd_quartos,qtd_banheiros,area,valor,descricao);
		return imovelDAO.inserirImovel(imovel);
	}
}
