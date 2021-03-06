package com.wr.vendas.services;

import java.util.List;

import com.wr.vendas.entities.Produtos;

public interface IProdutosServices {
	public List<Produtos> listarTodosProdutos(Produtos produtos);
	public Produtos cadastrarProduto(Produtos produtos);
	public void removerProduto(Long id);
	public void update(Produtos produtos);

}
