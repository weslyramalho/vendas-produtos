package com.wr.vendas.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.hasSize;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;


@SpringBootTest
@AutoConfigureMockMvc
public class ProdutosControllerTest {
	
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
	
	private static WireMockServer wireMockServer = new WireMockServer(options().port(8081));
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@BeforeEach
	void setUp() {
		wireMockServer.start();
	}
	
	@AfterAll
	static void afterAll() {
		wireMockServer.stop();
	}
	
	@Test
	public void buscarTodosProdutos() throws Exception{
		wireMockServer.stubFor(
				WireMock.get(urlPathEqualTo("/produtos"))
						.willReturn(aResponse()
								.withStatus(200)
								.withHeader("Content-Type", "application/json")
								.withBody((MOCKED_RESULT))));
		
		ResultActions resultActions = mockMvc.perform(
				get("/produtos").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(2)));
	}
	
	

}
