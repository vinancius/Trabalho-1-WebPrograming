package br.com.bean;

public class ImovelBean {
	private int qtd_quartos;
	private int qtd_banheiros;
	private double area;
	private double valor;
	private String descricao;
	private String nomeImovel;
	
	
	public ImovelBean(String nomeImovel,int qtd_quartos, int qtd_banheiros, double area, double valor, String descricao) {
		super();
		this.nomeImovel = nomeImovel;
		this.qtd_quartos = qtd_quartos;
		this.qtd_banheiros = qtd_banheiros;
		this.area = area;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public int getQtd_quartos() {
		return qtd_quartos;
	}
	public void setQtd_quartos(int qtd_quartos) {
		this.qtd_quartos = qtd_quartos;
	}
	public int getQtd_banheiros() {
		return qtd_banheiros;
	}
	public void setQtd_banheiros(int qtd_banheiros) {
		this.qtd_banheiros = qtd_banheiros;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeImovel() {
		return nomeImovel;
	}

	public void setNomeImovelm(String nomeImovel) {
		this.nomeImovel = nomeImovel;
	}
	
	
	
}
