package telran.text.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringClassTests {

	@Test
	void hasaValidBracketsTest() {
		assertTrue(Strings.hasaValidBrackets("aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd )"));
		assertFalse(Strings.hasaValidBrackets(")dfgswfgsf("));
		assertFalse(Strings.hasaValidBrackets("[werwert(wertwrtw] wertrt)"));
		assertFalse(Strings.hasaValidBrackets("aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd ){"));
	}
}