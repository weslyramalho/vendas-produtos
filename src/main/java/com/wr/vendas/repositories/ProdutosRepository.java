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
	
	public int cont() {
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
	

}
