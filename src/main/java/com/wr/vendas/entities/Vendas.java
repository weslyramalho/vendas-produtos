package com.wr.vendas.entities;

public class Vendas {
	private Long id;
	private Long quantidade;
	private Double desconto;
	
	private Produtos produtos;
	
	public Vendas() {
		
	}

	public Vendas(Long id,Long quantidade, Double desconto, Produtos produtos) {
		this.id = id;
		this.quantidade = quantidade;
		this.desconto = desconto;
		this.produtos = produtos;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Double precoTotal() {
		return produtos.getTamanhoDesconto(desconto) * quantidade;
	}
	
	

}
