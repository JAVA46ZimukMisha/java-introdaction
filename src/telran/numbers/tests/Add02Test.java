package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.Add02;

class Add02Test {

	@Test
	void toBinaryStrTest() {
		assertEquals(Integer.toBinaryString(100), Add02.toBinaryStr(100));
	}

}
