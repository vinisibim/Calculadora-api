package br.com.db1.calculadora.api.calculadoraapi.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.calculadora.api.calculadoraapi.dto.CalculadoraDTO;
import br.com.db1.calculadora.api.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.api.calculadoraapi.model.Operacao;
import br.com.db1.calculadora.api.calculadoraapi.service.CalculadoraService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

	@Autowired
	private CalculadoraService calculadoraService;

	@PostMapping
	public Calculadora salvaConta(@RequestBody CalculadoraDTO calculadora) {
		return calculadoraService.salvaCalculadora(calculadora.getNumeroDois(), calculadora.getNumeroUm(),
				calculadora.getOperacao());

	}
	
	@GetMapping
	public List<Calculadora> todosCalculos(){
		return calculadoraService.buscarTodosCalculos();
	}

}
