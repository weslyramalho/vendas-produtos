package com.wr.vendas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.wr.vendas.entities.Produtos;

@SpringBootTest
class ProdutosTest {

	@Test
	void calculandoValorTotalDoprecoDoProdutoComDesconto() {
		Produtos produtos = new Produtos(1l,"carro", 10l, 100.0, 0.10);
		Double resultado = produtos.getTamanhoDesconto(0.10);
		assertEquals(90.0, resultado);
	
	}
	
	@Test
	void calculandoValorTotalDoprecoDoProdutoComDescontoAcimadoDoValorpermitido() {
		Produtos produtos = new Produtos(1l,"carro", 10l, 100.0, 0.10);
		Double resultado = produtos.getTamanhoDesconto(0.15);
		assertEquals(90.0, resultado);
	
	}
	@Test
	void calculandoValorTotalDoprecoDoProdutoComDescontoAbaixoDoValorpermitido() {
		Produtos produtos = new Produtos(1l,"carro", 10l, 100.0, 0.10);
		Double resultado = produtos.getTamanhoDesconto(0.05);
		assertEquals(95.0, resultado);
	
	}

}
