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
		return null;
	}

	@Override
	public void removerProduto(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Produtos produtos) {
		// TODO Auto-generated method stub
		
	}

}
