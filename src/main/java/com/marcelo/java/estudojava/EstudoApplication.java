package com.marcelo.java.estudojava;

import com.marcelo.java.estudojava.utils.SenhaUtils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EstudoApplication {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;

	public static void main(String[] args) {
		SpringApplication.run(EstudoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String senhaEncoded = SenhaUtils.gerarBCrypt("teste");
			System.out.println("### Senha Encoded = " + senhaEncoded);
			System.out.println("### Quantidade de elementos por página = " + this.qtdPorPagina);
		};
	}
}
