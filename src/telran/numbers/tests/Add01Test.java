package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.Add01;

class Add01Test {

	@Test
	void maxSubsequenceLengthTest() {
		int[] arr = {1,3,3,2,8,8,8,5,6,6}; 
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[0];
		assertEquals(3, Add01.maxSubsequenceLength(arr));
		assertEquals(1, Add01.maxSubsequenceLength(arr1));
		assertEquals(0, Add01.maxSubsequenceLength(arr2));
	}

}
