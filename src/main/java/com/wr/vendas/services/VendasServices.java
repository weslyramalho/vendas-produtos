package com.wr.vendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wr.vendas.entities.Produtos;
import com.wr.vendas.entities.Vendas;
import com.wr.vendas.repositories.VendasRepository;

@Service
public class VendasServices implements IVendasServices{
	
	@Autowired
	private VendasRepository vendRep;

	@Override
	public List<Vendas> listarVendas(Produtos produtos) {
		return vendRep.listarVendas();
	}

	@Override
	public Vendas venderProduto(Vendas vendas) {
		if(vendas.getId() == null) {
			vendas.setId((vendRep.cont() + 1));
		}
		vendRep.venderProduto(vendas);
		return vendas;
	}
	

}
