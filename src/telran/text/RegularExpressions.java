package telran.text;

public class RegularExpressions {

	public static String javaVariableRegex() {	
		return "[a-zA-Z$][\\w$]*|_[\\w$]+";
	}
public static String arithmeticExpression() {
	return String.format("(%s)+(%s)",operatorAndOperand(), isOperandRegex());
}
private static String operatorAndOperand() {
	return String.format("(%s)+(%s)", isOperandRegex(), isOperatorsRegex());
}
public static String isOperatorsRegex() {
	return "[*/+-]";
}
private static String isOperandRegex() {
	return String.format("(%s)|(%s)", isIntOrDouble(), javaVariableRegex());
}
private static Object isIntOrDouble() {
	return "\\d+|(\\d+\\.\\d+)";
}
}

