package com.wr.vendas.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.wr.vendas.entities.Produtos;

@Repository
public class ProdutosRepository {
	private final List<Produtos> produtosList;

	public ProdutosRepository() {
		this.produtosList = new ArrayList<>();
	}
	
	public void cadastrarProduto(Produtos produtos) {
		this.produtosList.add(produtos);
	}
	
	public long cont() {
		return produtosList.size();

	}
	
	public void remove(Long id) {
		produtosList.removeIf(p -> p.getId() == id);
	}
	
	public List<Produtos> buscarProdutoPorNome(String produtos){
		return produtosList.stream()
				.filter(p -> p.getNome().equalsIgnoreCase(produtos))
				.collect(Collectors.toList());
	}
	
	public List<Produtos> todosProdutos(){
		return produtosList;
	}
	
	public Produtos buscaPorId(Long id) {
		return produtosList.stream()
				.filter(p -> p.getId().equals(id))
				.findFirst()
				.orElse(null);
	}
	public void update(Produtos produtos) {
		produtosList.stream()
		.filter(p-> p.getId().equals(produtos.getId()))
		.forEach(p -> p.setNome(produtos.getNome()));
		
		produtosList.stream()
		.filter(p-> p.getId().equals(produtos.getId()))
		.forEach(p -> p.setQuantidadeEstoque(produtos.getQuantidadeEstoque()));
		
		produtosList.stream()
		.filter(p-> p.getId().equals(produtos.getId()))
		.forEach(p -> p.setPreco(produtos.getPreco()));
		
		produtosList.stream()
		.filter(p-> p.getId().equals(produtos.getId()))
		.forEach(p -> p.setMaxDescontoPermitido(produtos.getMaxDescontoPermitido()));
		
	}
	

}
