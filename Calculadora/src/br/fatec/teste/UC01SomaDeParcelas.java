package br.fatec.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.servico.Calculadora;

public class UC01SomaDeParcelas {

	static Calculadora calculadora;
	
	//Modelo canônico = faz setup, testa, e depois devolve os recursos
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculadora = new Calculadora();
	}
	
	//Tecnica cx preta - classes de equivalencia ( um valido e um inválido )
	@Test
	public void CT01UC01SomaDeParcelaso_com_sucesso() {
		assertEquals("resultado=", 5, calculadora.soma("3,2"));
	}
	
	@Test(expected = RuntimeException.class)
	public void CT02UC01SomaDeParcelaso_dados_invalidos() {
		assertEquals("resultado=", 5, calculadora.soma("x,2"));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	

}
