package telran.text.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringClassTests {

	@Test
	void matchesTest() {
		String name1 = "David";
		String name2 = "david";
		String name3 = "John F";
		String name4 = "John Fitzgerald";
		String name5 = "John K";
		String name6 = "Anna Maria Magdalena";
		String name7 = "Anna Magdalena";
		String name8 = "Maria Magdalena";
		String name9 = "Anna Maria Roberta";
		String name10 = "Anna Magdalena Roberta";
		String name11 = "Anna Magdalena Maria";
		assertEquals("match", Strings.matches(name1, name2));
		assertEquals("match", Strings.matches(name3, name4));
		assertEquals("no match", Strings.matches(name5, name4));
		assertEquals("match", Strings.matches(name6, name7));
		assertEquals("match", Strings.matches(name6, name8));
		assertEquals("no match", Strings.matches(name6, name9));
		assertEquals("no match", Strings.matches(name6, name10));
		assertEquals("no match", Strings.matches(name6, name11));
		
		//        Examples:
//	        - David vs. david: match
//	        - John F vs. John Fitzgerald: match
//	        - John K vs. John Fitzgerald: no match
//	        - Anna Maria Magdalena vs. Anna Magdalena: match
//	        - Anna Maria Magdalena vs. Maria Magdalena: match
//	        - Anna Maria Magdalena vs. Anna Maria Roberta: no match
//	        - Anna Maria Magdalena vs. Anna Magdalena Roberta: no match
//	        - Anna Maria Magdalena vs. Anna Magdalena Maria: no match
	}
	@Test
	void sortStringsAsNumbersTest() {
		String[] array1 = new String[]{"10", "234", "2", "987", "1", "34", "99", "34", "99", "34"};
		String[] expected = new String[] {"1", "2","10", "34", "34", "34", "99", "99", "234", "987"};
		Strings.sortStringsAsNumbers(array1);
		assertTrue(Arrays.equals(array1, expected));
	}
}