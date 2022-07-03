package telran.text;

public class Strings {
	public static int[] deepNoRepeatedCompare(String str1, String str2) {
		int[] arrRes = new int[2];
		//1
		char[] arrH1 = str1.toCharArray();
		char[] arrH2 = str2.toCharArray();
		for(int i = 0; i<arrH2.length; i++){
			for(int j = 0; j<arrH1.length; j++) {
				if(arrH2[i] == arrH1[j] && (i == j)) {
					arrRes[0]++;
				}
				if(arrH2[i] == arrH1[j] && (i != j)) {
					arrRes[1]++;
				}
			}
		}
		//2
//		for(int i = 0; i<str2.length();i++) {
//			if(str1.indexOf(str2.charAt(i))==i) {
//				arrRes[0]++;
//			}
//			if(str1.indexOf(str2.charAt(i))!=i && str1.indexOf(str2.charAt(i))>=0) {
//				arrRes[1]++;
//			}
//		}
		return arrRes;
	}
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
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
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		for(int i = 0; i<arr1.length; i++) {
			int count = 0;
			int j = 0;
			do{
				if(arr1[i]==arr2[j]) {
					arr2[j]=0;
					count++;
				}
				j++;
			}while(count == 0 && j<arr2.length);			
				if(count == 0) {
					return false;
				}else {
					count = 0;
			}
		}
		return true;
	}
}
