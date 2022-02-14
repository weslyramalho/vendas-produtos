package com.wr.vendas.controller;



import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class ProdutosControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	private static final String MOCKED_RESULT = "{\"produtos\" :[\n"+
			" {\n" +
			" \"id\": 1, \n" +
			" \"nome\": \"TESTE\", \n" +
			" \"quantidadeEstoque\": 20, \n" +
			" \"preco\": 50.0, \n" +
			" \"maxDescontoPermitido\": 0.5, \n" +
			" }, \n" +
			" {\n" +
			" \"id\": 2, \n" +
			" \"nome\": \"TESTE2\", \n" +
			" \"quantidadeEstoque\": 40, \n" +
			" \"preco\": 100.0, \n" +
			" \"maxDescontoPermitido\": 0.5, \n" +
			" }, \n" +
			"]}";
	
	@Test
	public void buscarTodosProdutos() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders
						.post("/product")
                        .content(MOCKED_RESULT)
                        .contentType("application/json"))
                .andExpect(status().isCreated());
	}
	
	

}
