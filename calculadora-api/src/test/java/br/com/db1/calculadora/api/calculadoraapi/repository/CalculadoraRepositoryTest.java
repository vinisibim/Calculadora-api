package br.com.db1.calculadora.api.calculadoraapi.repository;



import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.db1.calculadora.api.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.api.calculadoraapi.model.Operacao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraRepositoryTest {

	@Autowired
	private CalculadoraRepository calculadoraRepository;


	@Test
	public void deveSalvarUmNovoCalculo() {
		Calculadora calculadora = new Calculadora(2d, 4d, Operacao.SOMA);
		calculadoraRepository.save(calculadora);
		
		List<Calculadora> buscar = calculadoraRepository.findAll();
		
		Calculadora resultado = buscar.get(0);
		
		
		
		Assert.assertEquals(resultado.getResultado(), calculadora.getResultado());
		
 	
	}

}
