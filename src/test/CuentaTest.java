package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	private Cuenta cuenta;
	
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
	void testIngresar() {
		int valorEsperado=500;
		
		cuenta.ingresar(500);
		assertEquals(valorEsperado, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		int valorEsperado=-500;
		
		cuenta.retirar(500);
		assertEquals(valorEsperado, cuenta.getSaldo());
	}

}
