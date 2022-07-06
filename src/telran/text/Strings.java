package telran.text;

public class Strings {
	public static boolean hasaValidBrackets(String text) {
		char[] textChar = text.toCharArray();
		char[] brOpen = { '(', '[', '{' };
		char[] brClose = { ')', ']', '}' };
		StringBuilder orderOpenedBr = new StringBuilder();
		for (int i = 0; i < textChar.length; i++) {
			if (!checkIfItOpenBr(brOpen, orderOpenedBr, textChar[i])) {
				if (!checkIfItCloseBr(brClose, brOpen, orderOpenedBr, textChar[i])) {
					return false;
				}
			}
		}
		if (orderOpenedBr.length() != 0)
			return false;
		return true;
	}

	private static boolean checkIfItCloseBr(char[] brClose, char[] brOpen, StringBuilder orderOpenedBr, char c) {
		boolean isItPossible = true;
		for (int i = 0; i < brClose.length; i++) {
			if (c == brClose[0] || c == brClose[1] || c == brClose[2]) {
				isItPossible = orderOpenedBr.length() == 0 ? false : removeIfCouple(orderOpenedBr, c, brOpen , brClose);
			}
		}
		return isItPossible;
	}

	private static boolean checkIfItOpenBr(char[] brOpen, StringBuilder orderOpenedBr, char c) {
		boolean ifItOpBr = true;
		for (int i = 0; i < brOpen.length; i++) {
			if (c != brOpen[0] && c != brOpen[1] && c != brOpen[2]) {
				ifItOpBr = false;
			} else {
				orderOpenedBr.append(c);
			}
		}
		return ifItOpBr;
	}

	private static boolean removeIfCouple(StringBuilder orderOpenedBr, char c, char[] brOpen, char[] brClose) {
		if ((c == brClose[0] && orderOpenedBr.charAt(orderOpenedBr.length() - 1) == brOpen[0])
				|| (c == brClose[1] && orderOpenedBr.charAt(orderOpenedBr.length() - 1) == brOpen[1])
				|| (c == brClose[2] && orderOpenedBr.charAt(orderOpenedBr.length() - 1) == brOpen[2])) {
			orderOpenedBr.deleteCharAt(orderOpenedBr.length() - 1);
			return true;
		}
		return false;
	}
}
