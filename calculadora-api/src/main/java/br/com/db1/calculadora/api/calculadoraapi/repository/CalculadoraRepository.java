package br.com.db1.calculadora.api.calculadoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.db1.calculadora.api.calculadoraapi.model.Calculadora;

public interface CalculadoraRepository extends JpaRepository<Calculadora, Long> {

}
