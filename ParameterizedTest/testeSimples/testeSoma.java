package aula2.testeSimples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testeSoma {

	@Test
	public void testSomaDoisInteirosPositivos() {
		int resultado = Calculadora.soma(2,3);
		assertEquals(5, resultado);
		System.out.println(this);
	}
	
	@Test
	public void testSomaDoisInteirosNegativos() {
		int resultado = Calculadora.soma(-2,-3);
		assertEquals(-5, resultado);
		System.out.println(this);
	}
	
	@Test
	public void testSomaDoisInteirosComplementares() {
		int resultado = Calculadora.soma(-2,2);
		assertEquals(0, resultado);
		System.out.println(this);
	}

}