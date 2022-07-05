package telran.text;

public class Strings {
	static public String matches(String name1, String name2) {
		boolean res = true;
		String[] nameHelp1 = name1.toLowerCase().split(" ");
		String[] nameHelp2 = name2.toLowerCase().split(" ");
		for(int i = 0; i<nameHelp2.length; i++) {
			if(nameHelp1.length == nameHelp2.length && !isPartNameSame(nameHelp1[i], nameHelp2[i])) {
				return "no match";
			}
			if(nameHelp1.length != nameHelp2.length) {
			res = checkIfLengthsNotSame(nameHelp1, nameHelp2, i);
			}
		}
		
		return res?"match":"no match";
	}
	private static boolean checkIfLengthsNotSame(String[] nameHelp1, String[] nameHelp2, int i) {
		boolean res = true;
			int count = 0;
			do {
			res = isPartNameSame(nameHelp1[i+count], nameHelp2[i]);
			count++;
			}while(res==false && i+count < nameHelp1.length);
			if(i+count == nameHelp1.length-1 && i!=nameHelp2.length-1) {
				 res = false;
			}
		return res;
	}
	static boolean isPartNameSame(String partName1, String partName2) {
		boolean res = true;
		int partNameLength1 = partName1.length();
		int partNameLength2 = partName2.length();
		if(partNameLength1!=partNameLength2 && partNameLength1!=1 && partNameLength2!=1) {
			res = false;
		}else if(partNameLength1==1 || partNameLength2==1) {
			res = partName1.charAt(0)==partName2.charAt(0)?true:false;
		}else {
		res=isSame(partName1,partName2,partNameLength1);
		}
		return res;
	}
	private static boolean isSame(String partName1, String partName2, int partNameLength) {
		for(int i = 0; i<partNameLength; i++) {
			if(partName1.charAt(i)!=partName2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
//Task2
	static public void sortStringsAsNumbers(String[] strNumbers) {
		int[] helper = new int[1000];
		fillHelper(strNumbers, helper);
		fillMainArray(strNumbers, helper);
		
	}
	private static void fillMainArray(String[] strNumbers, int[] helper) {
		for(int i = 0, j = 0; i<helper.length; i++) {
			while(helper[i]>0) {
				strNumbers[j] = String.valueOf(i);
				j++;
				helper[i]--;
			}
		}
	}
	private static void fillHelper(String[] strNumbers, int[] helper) {
		for(int i = 0; i<strNumbers.length; i++) {
			helper[Integer.parseInt(strNumbers[i])]++;
		}
	}	
	}
