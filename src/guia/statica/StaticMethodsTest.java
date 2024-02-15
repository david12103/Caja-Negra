package guia.statica;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaticMethodsTest {

	@Test
	void testGiveME() {
		assertTrue(StaticMethods01.giveME());
//		StaticMethods01.getValor();
		int valorEstatico = 44;
		StaticMethods01.setValorEstatico(valorEstatico);
		assertEquals(valorEstatico,StaticMethods01.getValorEstatico());
	}

}
