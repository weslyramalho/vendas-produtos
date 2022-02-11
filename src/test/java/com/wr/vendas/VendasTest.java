package com.wr.vendas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.wr.vendas.entities.Produtos;
import com.wr.vendas.entities.Vendas;

@SpringBootTest
class VendasTest {

	@Test
	void calculandoValorTotalDaVenda() {
		final Produtos produtos = new Produtos(1l,"carro", 10l, 10.0, 5.0);
		final Vendas vendas = new Vendas(1l,3l, 0.0, produtos);
		final Double resultado = vendas.precoTotal();
		assertEquals(30.0, resultado);
	
	}
	
}
