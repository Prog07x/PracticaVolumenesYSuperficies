package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cubo;

class TestCubo {

	/****
	 * Test de la superficie del Cubo
	 */
	@Test
	void testSuperficie() {
		Cubo c = new Cubo(3);
		int SuperficieEsperada= 54;
		assertEquals(c.superficie(),SuperficieEsperada);
	}

	/****
	 * Test de volumen del Cubo
	 */
	@Test
	void testVolumen() {
		Cubo c = new Cubo(2);
		int VolumenEsperado = 8;
		assertEquals(c.volumen(),VolumenEsperado );
	}

}
