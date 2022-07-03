package telran.text;

public class Strings {
	public static int[] deepNoRepeatedCompare(String str1, String str2) {
		int[] arrRes = new int[2];
		//1
//		char[] arrH1 = str1.toCharArray();
//		char[] arrH2 = str2.toCharArray();
//		for(int i = 0; i<arrH2.length; i++){
//			for(int j = 0; j<arrH1.length; j++) {
//				if(arrH2[i] == arrH1[j] && (i == j)) {
//					arrRes[0]++;
//				}
//				if(arrH2[i] == arrH1[j] && (i != j)) {
//					arrRes[1]++;
//				}
//			}
//		}
		//2
//		for(int i = 0; i<str2.length();i++) {
//			if(str1.indexOf(str2.charAt(i))==i) {
//				arrRes[0]++;
//			}
//			if(str1.indexOf(str2.charAt(i))!=i && str1.indexOf(str2.charAt(i))>=0) {
//				arrRes[1]++;
//			}
//		}
		//3
		int[] arrHelp1 = new int [128];
		int[] arrHelp2 = new int [128];
		for(int i = 0; i< str1.length(); i++) {
			arrHelp1[(int) str1.charAt(i)] = i+1;
		}
		for(int i = 0; i<str2.length(); i++) {
			arrHelp2[(int) str2.charAt(i)] = i+1;
		}
		for(int i = 0; i<arrHelp1.length; i++) {
			if(arrHelp1[i] == arrHelp2[i] && arrHelp2[i] != 0) {
				arrRes[0]++;
			}
			if(arrHelp1[i] != arrHelp2[i] && arrHelp2[i] != 0 && arrHelp1[i] != 0) {
				arrRes[1]++;
			}
		}
		return arrRes;
	}
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		//1
//		int[] arrHelp = new int[str1.length()];
//		for(int i = 0; i<str2.length();i++) {
//			for(int j = 0; j<str2.length(); j++) {
//				if(str2.toLowerCase().charAt(i) == str2.toLowerCase().charAt(j)){
//					arrHelp[i]++;
//				}
//			}
//		int count = 0;
//			for(int j = 0; j<arrHelp.length; j++) {
//				if(str2.toLowerCase().charAt(i) == str1.toLowerCase().charAt(j)) {
//					count++;
//				}
//			}
//			if(arrHelp[i] != count) {
//				return false;
//			}
//			count = 0;
//		}
		//2
		String str01 = str1.toUpperCase();
		String str02 = str2.toUpperCase();
		int[] arrHelp1 = new int[91];
		int[] arrHelp2 = new int[91];
		for(int i = 0; i<str01.length(); i++) {
			arrHelp1[(int) str01.charAt(i)] += 1;
			arrHelp2[(int) str02.charAt(i)] +=1;
		}
		for(int i=0; i<arrHelp1.length; i++) {
			if(arrHelp1[i] != arrHelp2[i]) {
				return false;
			}
		}
		return true;
	}
}
