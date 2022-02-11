package com.wr.vendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wr.vendas.entities.Produtos;
import com.wr.vendas.repositories.ProdutosRepository;

@Service
public class ProdutosServices implements IProdutosServices{
	
	@Autowired
	private ProdutosRepository prodRep;

	@Override
	public List<Produtos> listarTodosProdutos(String produtos) {
		return prodRep.todosProdutos();
	}

	@Override
	public Produtos cadastrarProduto(Produtos produtos) {
		if(produtos.getId() == null) {
			produtos.setId(prodRep.cont() + 1);
		}
		prodRep.cadastrarProduto(produtos);
		return produtos;
	}

	@Override
	public void removerProduto(Long id) {
		prodRep.remove(id);
		
	}

	@Override
	public void update(Produtos produtos) {
		prodRep.update(produtos);
		
	}

}
