package telran.text;

public class Strings {
	public static boolean hasaValidBrackets(String text) {
		char[] textChar = text.toCharArray();
		char[] brOpen = { '(', '[', '{' };
		char[] brClose = { ')', ']', '}' };
		StringBuilder orderOpenedBr = new StringBuilder();
		for (int i = 0; i < textChar.length; i++) {
			if (!checkIfItOpenBr(brOpen, orderOpenedBr, textChar[i])) {
				if (!checkIfItCloseBr(brClose, orderOpenedBr, textChar[i])) {
					return false;
				}
			}
		}
		if (orderOpenedBr.length() != 0)
			return false;
		return true;
	}

	private static boolean checkIfItCloseBr(char[] brClose, StringBuilder orderOpenedBr, char c) {
		boolean isItPossible = true;
		for (int i = 0; i < brClose.length; i++) {
			if (c == ')' || c == ']' || c == '}') {
				isItPossible = orderOpenedBr.length() == 0 ? false : removeIfCouple(orderOpenedBr, c);
			}
		}
		return isItPossible;
	}

	private static boolean checkIfItOpenBr(char[] brOpen, StringBuilder orderOpenedBr, char c) {
		boolean ifItOpBr = true;
		for (int i = 0; i < brOpen.length; i++) {
			if (c != '(' && c != '[' && c != '{') {
				ifItOpBr = false;
			} else {
				orderOpenedBr.append(c);
			}
		}
		return ifItOpBr;
	}

	private static boolean removeIfCouple(StringBuilder orderOpenedBr, char c) {
		if ((c == ')' && orderOpenedBr.charAt(orderOpenedBr.length() - 1) == '(')
				|| (c == ']' && orderOpenedBr.charAt(orderOpenedBr.length() - 1) == '[')
				|| (c == '}' && orderOpenedBr.charAt(orderOpenedBr.length() - 1) == '{')) {
			orderOpenedBr.deleteCharAt(orderOpenedBr.length() - 1);
			return true;
		}
		return false;
	}
}
