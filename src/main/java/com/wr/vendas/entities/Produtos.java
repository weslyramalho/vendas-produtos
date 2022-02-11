package com.wr.vendas.entities;

public class Produtos {
	private Long id;
	private String nome;
	private Long quantidadeEstoque;
	private Double preco;
	private Double maxDescontoPermitido;
	
	public Produtos() {
		
	}
	public Produtos(Long id, String nome, Long quantidadeEstoque, Double preco, Double maxDescontoPermitido) {
		this.id = id;
		this.nome = nome;
		this.quantidadeEstoque = quantidadeEstoque;
		this.preco = preco;
		this.maxDescontoPermitido = maxDescontoPermitido;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(Long quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getMaxDescontoPermitido() {
		return maxDescontoPermitido;
	}
	public void setMaxDescontoPermitido(Double maxDescontoPermitido) {
		this.maxDescontoPermitido = maxDescontoPermitido;
	}
	public Double getTamanhoDesconto(final Double desconto) {
		if (desconto > maxDescontoPermitido) {
			return preco * (1 - maxDescontoPermitido);
		} else {
			return preco * (1 - desconto);
		}
	}
	@Override
	public String toString() {
		return "Produtos [id=" + id + ", nome=" + nome + ", quantidadeEstoque=" + quantidadeEstoque + ", preco=" + preco
				+ ", maxDescontoPermitido=" + maxDescontoPermitido + "]";
	}

}
