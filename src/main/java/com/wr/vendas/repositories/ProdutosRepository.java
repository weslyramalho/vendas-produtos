package com.wr.vendas.repositories;

import java.util.ArrayList;
import java.util.List;

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
	

}
