package piedarapapeltiejeras08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RockPaperScissorsGameTest {
	RockPaperScissorsGame game;

	@BeforeEach
	void setUp() throws Exception {
		game = new RockPaperScissorsGameImplementation();
	}

	@Test
	void testPlayerChoose() {
		// modifica atributos y habria que ver si los ha modificado
		// pero si no sse suficiente sobre un metodo no me lo puedo inventar
//		game.startNewGame();
		int j = 100;
		for (int i = 0; i < j; i++) {
			// caso 0 yo tengo un a piedra
			int value = 0;
			int resultado = game.playerChoose(value);
			int maquinaJugada = game.getComputerChoice();
			// empate
			if (resultado == 0)
				assertEquals(maquinaJugada, value);// 0:0
			// derrota (yo pierdo)
			if (resultado == -1)
				assertEquals(maquinaJugada, 1); // 0:1
			// victoria (yo gano)
			if (resultado == 1)
				assertEquals(maquinaJugada, 2);// 0:2
			// caso 1 yo tengo un papel
			value = 1;
			resultado = game.playerChoose(value);
			maquinaJugada = game.getComputerChoice();
			// empate
			if (resultado == 0)
				assertEquals(maquinaJugada, value);// 1:1
			// derrota (yo pierdo)
			if (resultado == -1)
				assertEquals(maquinaJugada, 2); // 1:2
			// victoria (yo gano)
			if (resultado == 1)
				assertEquals(maquinaJugada, 0);// 1:0
			// caso 1 yo tengo unas tijeras
			value = 2;
			resultado = game.playerChoose(value);
			maquinaJugada = game.getComputerChoice();
			// empate
			if (resultado == 0)
				assertEquals(maquinaJugada, value);// 2:2
			// derrota (yo pierdo)
			if (resultado == -1)
				assertEquals(maquinaJugada, 0); // 2:0
			// victoria (yo gano)
			if (resultado == 1)
				assertEquals(maquinaJugada, 1);// 2:1

		}
	}

	void testCorto() {
		int j = 100;
		int valoresdePrueba=3;
		int valoresContrincantes[][]= {
				{1,2},//caso 0
				{2,0},//caso 1
				{0,1} //caso 2
		};
		for (int value = 0; value < valoresdePrueba; value++) {
			for (int i = 0; i < j; i++) {
				int resultado = game.playerChoose(value);
				int maquinaJugada = game.getComputerChoice();
				// empate
				if (resultado == 0)
					assertEquals(maquinaJugada, value);// 0:0
				// derrota (yo pierdo)
				if (resultado == -1)
					assertEquals(maquinaJugada,valoresContrincantes[value][0]); // 0:1
				// victoria (yo gano)
				if (resultado == 1)
					assertEquals(maquinaJugada, valoresContrincantes[value][1]);// 0:2
			}
		}
		
	}
}
