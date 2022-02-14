package com.wr.vendas.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wr.vendas.entities.Vendas;

@Repository
public class VendasRepository {

	private final List<Vendas> vendasList;
	
	public VendasRepository() {
		this.vendasList = new ArrayList<>();
	}
	
	public void venderProduto(Vendas vendas) {
		this.vendasList.add(vendas);
	}
	
	public long cont() {
		return vendasList.size();
	}
	
	 public List<Vendas> listarVendas(){
		 return vendasList;
	 }
	 
	 public Double CalcularVendas(final List<Vendas> produtos) {
		 return produtos.stream().mapToDouble(Vendas::precoTotal).sum();
	 }

}
