package com.wr.vendas.services;

import java.util.List;

import com.wr.vendas.entities.Produtos;

public interface IProdutos {
	public List<Produtos> listarTodosProdutos(String produtos);
	public Produtos cadastrarProduto(Produtos produtos);
	public void removerProduto(Long id);
	public void update(Produtos produtos);

}
