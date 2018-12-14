package br.com.db1.calculadora.api.calculadoraapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Calculadora")
public class Calculadora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "numeroUm", length = 60, nullable = false)
	private Double num1;

	@Column(name = "numeroDois", length = 60, nullable = false)
	private Double num2;

	@Enumerated(EnumType.STRING)
	@Column(name = "operacao", length = 60, nullable = false)
	private Operacao operacao;

	@Column(name = "dataOperacao", length = 60, nullable = false)
	private LocalDateTime data;

	@Column(name = "resultado", length = 60, nullable = false)
	private Double resultado;

	protected Calculadora() {
	}

	public Calculadora(Double num1, Double num2, Operacao operacao) {
		this.num1 = num1;
		this.num2 = num2;
		this.operacao = operacao;
		this.data = LocalDateTime.now();
		this.fazCalculo();
		
	}

	private void fazCalculo() {
		this.resultado= this.operacao.fazCalculo(this.num1, this.num2);
	}

	public Long getId() {
		return id;
	}

	public Double getNumUm() {
		return num1;
	}

	public Double getNumDois() {
		return num2;
	}

	public Double getResultado() {
		return resultado;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public Operacao getOperacao() {
		return operacao;
	}
}
