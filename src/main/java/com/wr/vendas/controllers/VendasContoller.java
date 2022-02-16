package com.wr.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wr.vendas.entities.Produtos;
import com.wr.vendas.entities.Vendas;
import com.wr.vendas.repositories.VendasRepository;
import com.wr.vendas.services.VendasServices;

@RestController
@RequestMapping("/vendas")
public class VendasContoller {
	
	@Autowired
	VendasServices vendasServ;
	
	@Autowired
	VendasRepository vendasRep;
	
	@PostMapping
	public ResponseEntity<Vendas> post(@RequestBody final Vendas vendas){
		vendasServ.venderProduto(vendas);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	@GetMapping
	public List<Vendas> findAll(@RequestParam(required = false)Produtos produtos){
		return vendasServ.listarVendas(produtos);
	}
	

}
