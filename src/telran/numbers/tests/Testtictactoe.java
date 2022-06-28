package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.TictactoeGame;

class Testtictactoe {

	@Test
	void TictactoeGametest() {
		char matrix1[][] = {
				{'0', '1', 'x'},
				{'x', '0', '1'},
				{'1', '1', '1'}
		};
		char matrix2[][] = {
				{'x', '0', 'x'},
				{'0', '0', 'x'},
				{'0', 'x', '1'}
		};
		char matrix3[][] = {
				{'0', '1', 'x'},
				{'x', '1', '1'},
				{'1', '1', '0'}
		};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix1, 2, 2, '0'));
		assertEquals(0, TictactoeGame.tictactoeMove(matrix1, 2, 2, 'x'));
		assertEquals(2, TictactoeGame.tictactoeMove(matrix2, 2, 2, '0'));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix3, 1, 1, '0'));
	}

}
