package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.bean.ImovelBean;

public class ImovelDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	
	public ImovelDAO() {
		conn = new ConnectionFactory().getConnection();
	}
	
	public ArrayList<ImovelBean> listarImoveis() {
		String sql = "SELECT nomeImovel,qtd_quartos,qtd_banheiros,area,valor,descricao FROM Imoveis";
		ArrayList<ImovelBean> imoveis = new ArrayList<ImovelBean>();
		try {
			
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				ImovelBean imovel = new ImovelBean(rs.getString("nomeImovel"),rs.getInt("qtd_quartos"),rs.getInt("qtd_banheiros"),rs.getDouble("area"),rs.getDouble("valor"),rs.getString("descricao"));
				imoveis.add(imovel);
			}
			System.out.println(imoveis);
			return imoveis;
		} catch(Exception erro) {
			return imoveis;
		}
		
	}
	
	public boolean inserirImovel(ImovelBean imovelBean) {
		String sql = "INSERT INTO Imoveis (nomeImovel,qtd_quartos,qtd_banheiros,area,valor,descricao) values (?,?,?,?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, imovelBean.getNomeImovel());
			ps.setInt(2, imovelBean.getQtd_quartos());
			ps.setInt(3, imovelBean.getQtd_banheiros());
			ps.setDouble(4, imovelBean.getArea());
			ps.setDouble(5, imovelBean.getValor());
			ps.setString(6, imovelBean.getDescricao());
			ps.execute();
			ps.close();
			return true;
		} catch(Exception erro) {
			return false;
		}
	}
}
