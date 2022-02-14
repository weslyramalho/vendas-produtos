package com.wr.vendas.services;

import java.util.List;

import com.wr.vendas.entities.Produtos;
import com.wr.vendas.entities.Vendas;

public interface IVendasServices {
	
	public Vendas venderProduto(Vendas vendas);
	public List<Vendas> listarVendas(Produtos produtos);
	
	

}
