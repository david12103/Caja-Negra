package guia.objetos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EveryTestNeedsAValue08TestTwo {

	// imagimenos que necesitamos meter algunos valores para hacer las pruebas
	// vamos a poner todas las posible combinaciones y las probamos
	EveryTestNeedsAValue08 object;
	static EveryTestNeedsAValue08 staticObject;
	int size;
	
	@BeforeAll
	static void algo() {
		int size=8;
		System.out.println("Entrando en beforeAll");
		staticObject=new EveryTestNeedsAValue08(size);
		staticObject.addValue(9);
	}

	@BeforeEach()
	void otro() {
		System.out.println("entrando en beforeEach");
		size = 5;
		object=new EveryTestNeedsAValue08(size);
		object.addValue(7);
		
	}

	@Test
	void testOne() {
		System.out.println("en test uno");
		object.addValue(11);
		System.out.println(object.amount.toString());
		staticObject.addValue(29);
	}

	@Test
	void testTwo() {
		System.out.println("en test Two");
		object.addValue(21);
		System.out.println(object.amount.toString());
		staticObject.addValue(39);
	}

	@AfterEach
	void aft() {
		System.out.println("en afterEach");
		size=8;
	}

	@AfterAll
	static void aftee() {
		System.out.println("en afterAll");
	}
}
