package telran.text;
import static telran.text.RegularExpressions.*;
public class Strings {
	public static boolean isArithmeticExpression(String expression) {
		if(!checkParentheses(expression)) {
			return false;
		}
		expression = removeSpacesAndParentheses(expression);
		return expression.matches(arithmeticExpression());
	}
	private static String removeSpacesAndParentheses(String expression) {
		expression = expression.replace("(", "");
		expression = expression.replace(")", "");
		expression = expression.replace(" ","");
		return expression;
	}
	private static boolean checkParentheses(String expression) {
		int strLength = expression.length();
		int par = 0;
		String operators = "*/+-";
		for(int i=0; i<strLength; i++) {
			if(expression.charAt(i)=='(') {
				par++;
				if(i>=1 && i<strLength-1 && (operators.indexOf(expression.charAt(i-1))<0 || operators.indexOf(expression.charAt(i+1))>=0)) {
					return false;
				}
			}
			if(expression.charAt(i)==')') {
				par--;
				if(i>=1 && i<strLength-1 &&(operators.indexOf(expression.charAt(i-1))>=0 || operators.indexOf(expression.charAt(i+1))<0)) {
					return false;
				}
			}
			if (par<0) return false;
		}
		return par==0 ? true:false;
	}
}
