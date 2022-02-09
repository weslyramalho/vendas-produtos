package com.wr.vendas.services;

import java.util.List;

import com.wr.vendas.entities.Produtos;

public interface IVendasServices {
	
	public List<Produtos> venderProduto(Double total);

}
