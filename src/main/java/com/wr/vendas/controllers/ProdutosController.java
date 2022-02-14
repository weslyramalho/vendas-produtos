package com.wr.vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wr.vendas.entities.Produtos;
import com.wr.vendas.repositories.ProdutosRepository;
import com.wr.vendas.services.ProdutosServices;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
	
	@Autowired
	ProdutosServices prodServ;
	
	@Autowired
	ProdutosRepository prodRep;
	
	@PostMapping
	public ResponseEntity<Produtos> post(@RequestBody final Produtos produtos){
		prodServ.cadastrarProduto(produtos);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	

}
