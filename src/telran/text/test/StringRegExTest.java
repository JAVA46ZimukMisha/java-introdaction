package telran.text.test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static telran.text.Strings.*;
import org.junit.jupiter.api.Test;

public class StringRegExTest {
	@Test
	void arithmeticExpressionTrue() {
		assertTrue(isArithmeticExpression("b+c"));
		assertTrue(isArithmeticExpression("a+(4-abc4)*2"));
		assertTrue(isArithmeticExpression("a+$2- 5.0 *(3-2+x)/1. 2"));
		assertTrue(isArithmeticExpression("(a+4.2)-(abc4)*2"));
		assertTrue(isArithmeticExpression("x+y-(__*$)+2.1"));
	}
	@Test
	void arithmeticExpressionFalse() {
		assertFalse(isArithmeticExpression(")-1+3("));
		assertFalse(isArithmeticExpression("(+b+c)+7"));
		assertFalse(isArithmeticExpression("b+(c+7+)"));
		assertFalse(isArithmeticExpression("-1+3"));
		assertFalse(isArithmeticExpression("x+y-(__*$)++2.1+()-2"));//if inside of brackets there is no symbols it returns false;
		assertFalse(isArithmeticExpression("x+y-(__*$)+.1"));
		assertFalse(isArithmeticExpression("1+2-(5*)4"));
		assertFalse(isArithmeticExpression("3+5-(2+7"));
		assertFalse(isArithmeticExpression("3+5-_+7"));
	}
}
