package telran.text;

public class Strings {
	public static boolean hasaValidBrackets(String text) {
		int Tlength = text.length();
		String brOpen = "([{";
		String brClose = ")]}";
		StringBuilder orderOpenedBr = new StringBuilder();
		boolean res = true;
		for (int i = 0; i < Tlength; i++) {
			if (brOpen.indexOf(text.charAt(i))>=0) {
				orderOpenedBr.append(text.charAt(i));
			}
			else if(brClose.indexOf(text.charAt(i))>=0) {
				res = orderOpenedBr.length() == 0 ? false : removeIfCouple(orderOpenedBr, text.charAt(i), brOpen , brClose);
				}
			if(!res) {
				return false;
			}
			}
		if (orderOpenedBr.length() != 0)
			return false;
		return true;
	}

	private static boolean removeIfCouple(StringBuilder orderOpenedBr, char c, String brOpen, String brClose) {
		if (orderOpenedBr.charAt(orderOpenedBr.length() - 1) == brOpen.charAt(brClose.indexOf(c))) {
			orderOpenedBr.deleteCharAt(orderOpenedBr.length() - 1);
			return true;
		}
		return false;
	}
}
