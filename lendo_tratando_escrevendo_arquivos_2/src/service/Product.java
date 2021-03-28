package service;

public class Product {
	
	public String nome_produto;
	public Double valor_produto;
	public Integer quantidade_produto;
	
	public Product(String nome_produto, Double valor_produto, Integer quantidade_produto) {
		super();
		this.nome_produto = nome_produto;
		this.valor_produto = valor_produto;
		this.quantidade_produto = quantidade_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public Double getValor_produto() {
		return valor_produto;
	}

	public void setValor_produto(Double valor_produto) {
		this.valor_produto = valor_produto;
	}

	public int getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public double total() {
		return valor_produto * quantidade_produto;
	}
	
	
	
}
