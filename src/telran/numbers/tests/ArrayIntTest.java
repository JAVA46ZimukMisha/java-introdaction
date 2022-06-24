package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.numbers.ArrayInt;

class ArrayIntTest {
	private static final int LARGE_N_NUMBERS = 100000;
	
	private void runSortTest(int[] ar) {
		for(int i = 1; i<ar.length; i++) {
			assertTrue(ar[i-1]<=ar[i]);
		}
	}
	private void fillRandomNumbers(int[] ar) {
		for(int i = 0; i<ar.length; i++) {
			ar[i]=(int) (Math.random()*Integer.MAX_VALUE);
		}
	}
	@Test
	void sortLargeTest() {
		int ar[] = new int[LARGE_N_NUMBERS];
		fillRandomNumbers(ar);
		Arrays.sort(ar);
		ArrayInt.sort(ar);
		runSortTest(ar);
	}
	@Test
	void binarySearchTest() {
		int ar[]= {1,5,100,200,350,500};
		assertEquals(0, ArrayInt.binaryIndexOf(ar, 1));
		assertEquals(2, ArrayInt.binaryIndexOf(ar, 100));
		assertEquals(5, ArrayInt.binaryIndexOf(ar, 500));
		assertTrue(ArrayInt.binaryIndexOf(ar, 150)<0);
		//test for homework 4 
		assertEquals(-1, ArrayInt.binaryIndexOf(ar, -10));
		assertEquals(-4, ArrayInt.binaryIndexOf(ar, 150));
		assertEquals(-7, ArrayInt.binaryIndexOf(ar, 600));
		int ar1[]= {1,1,1,1,1};
		assertEquals(0, ArrayInt.binaryIndexOf(ar1, 1));
	}
}
