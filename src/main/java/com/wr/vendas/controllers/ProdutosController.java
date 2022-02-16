package com.wr.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping
	public List<Produtos> findAll(@RequestParam(required = false)Produtos produtos){
		return prodServ.listarTodosProdutos(produtos);
	}
	
	@DeleteMapping
	  public ResponseEntity<Produtos> delete(Long id) {
		  prodServ. removerProduto(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	  }

}
