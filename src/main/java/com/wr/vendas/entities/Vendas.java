package com.wr.vendas.entities;

public class Vendas {
	private Long quantidade;
	private Integer desconto;
	
	private Produtos produtos;
	
	public Vendas() {
		
	}

	public Vendas(Long quantidade, Integer desconto, Produtos produtos) {
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

	public Integer getDesconto() {
		return desconto;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
	
	

}
