package com.wr.vendas.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wr.vendas.entities.Produtos;
import com.wr.vendas.entities.Vendas;

@Repository
public class VendasRepository {
	private final List<Produtos> produtosList;
	private final List<Vendas> vendasList;
	
	public VendasRepository() {
		this.produtosList = new ArrayList<>();
		this.vendasList = new ArrayList<>();
	}
	
	public void venderProduto(Vendas vendas) {
		this.vendasList.add(vendas);
	}
	
	public int cont() {
		return vendasList.size();
	}
	
	public void remove(Long id) {
		vendasList.removeIf(v -> v.getId() == id);
	}
	
	public List<Vendas> buscarVendasPorProduto(Produtos produtos){
		return vendasList.stream()
				.filter(v -> v.getProduto().equalsIgnoreCase(produtos))
				.collect(collectors.toList());
	}
	 public List<Vendas> listarVendas(){
		 return vendasList;
	 }

}
