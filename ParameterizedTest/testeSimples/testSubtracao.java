package aula2.testeSimples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testSubtracao {

	@Test
	public void testSubtracaoDoisInteirosPositivos() {
		int resultado; 
		resultado = Calculadora.subtracao(3,2);
		assertEquals(1, resultado);
		resultado = Calculadora.subtracao(2,3);
		assertEquals(-1,resultado);
	}
	
	@Test
	public void testSutracaoDoisInteirosNegativos() {
		int resultado; 
		resultado = Calculadora.subtracao(-2, -3);
		assertEquals(1, resultado);
		resultado = Calculadora.subtracao(-3, -2);
		assertEquals(-1, resultado);
	}
	
	@Test
	public void testSubtracaoDoisInteirosComplementares() {
		int resultado; 
		resultado = Calculadora.subtracao(-2, 2);
		assertEquals(-4, resultado);
		resultado = Calculadora.subtracao(2, -2);
		assertEquals(4, resultado);
	}
}
