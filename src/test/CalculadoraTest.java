package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion3.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testSuma() {
		int valorEsperado=5;
		assertEquals(valorEsperado, Calculadora.suma(2, 3));
	}
	
	@Test
	void testResta() {
		int valorEsperado=2;
		assertEquals(valorEsperado, Calculadora.resta(5, 3));
	}
	
	@Test
	void testMultiplicacion() {
		int valorEsperado=6;
		assertEquals(valorEsperado, Calculadora.multiplicacion(2, 3));
	}
	
	@Test
	void testDivision() {
		int valorEsperado=3;
		assertEquals(valorEsperado, Calculadora.division(6, 2));
	}

}
