package com.wr.vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wr.vendas.repositories.VendasRepository;
import com.wr.vendas.services.VendasServices;

@RestController
@RequestMapping("/vendas")
public class VendasContoller {
	
	@Autowired
	VendasServices vendasServ;
	
	@Autowired
	VendasRepository vendasRep;

}
