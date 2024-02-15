package guia.objetos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MethodPrivate04Test {

	@Test
	void test() {
		MethodPrivate04 methodPrivate04=new MethodPrivate04();
		//no se puede acceder a metodos privados
		//no se debe probar directamente
//		assertTrue(methodPrivate04.tellMe());
		//si no, a traves, de su cara publica
		assertTrue(methodPrivate04.usadorDePrivado());
		
	}

}
