package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "<b>BSM's</b>" + "<br>Mentalidade de Crescimento" + "<br>Persistência" + "<br>Responsabilidade Pessoal"
				+ "<br>Orientação ao Futuro" + "<br>Comunicação" + "<br>Orientação ao Detalhe" + "<br>Proatividade"
				+ "<br>Trabalho em Equipe" + "<br>Dar e Receber" + "<br>Gestão do Tempo<br>";

	}

	@GetMapping("/objetivo")
	public String objetivo() {
		return "<b>Objetivo da semana:</b>" + "<br>Proatividade" + "<br>Orientação aos detalhes";
	}

}
