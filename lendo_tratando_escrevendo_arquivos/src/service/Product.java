package service;

public class Product {
	
	public String nome_produto;
	public String valor_produto;
	public String quantidade_produto;
	
	public Product(String nome_produto, String valor_produto, String quantidade_produto) {
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

	public String getValor_produto() {
		return valor_produto;
	}

	public void setValor_produto(String valor_produto) {
		this.valor_produto = valor_produto;
	}

	public String getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(String quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}
	
	
	@Override
	public String toString() {
		return nome_produto + ","
				+ valor_produto + ","
				+ quantidade_produto;
	}

	
	
}
