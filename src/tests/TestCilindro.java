package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cilindro;

class TestCilindro {

	/****
	 * Test de la superficie del Cilindro
	 */
	@Test
	void testSuperficie() {
		Cilindro c = new Cilindro();
		int superficieEsperada = (int)12.56;
		assertEquals(c.superficie(), superficieEsperada);
	}

	/****
	 * Test del volumen del cilindro
	 */
	@Test
	void testVolumen() {
		Cilindro c = new Cilindro();
		int volumenEsperada = (int)3.14;
		assertEquals(c.volumen(), volumenEsperada);
	}

}
