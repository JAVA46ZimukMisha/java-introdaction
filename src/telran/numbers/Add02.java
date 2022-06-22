package telran.numbers;

public class Add02 {
//	1) Write class NumberConvertor with method toBinaryStr, as follows:
//
//	    public static String toBinaryStr(int number)
//
//	   which converts non-negative integer number to String with binary form of the given number.
//	   Please DON'T use the existing method Integer.toBinaryString()
//
//	2) Write tests checking the proper work of toBinaryStr() method with different numbers,
//	   comparing its results with results of Integer.toBinaryString()
	public static String toBinaryStr(int number) {
		int binaryInt = 0;
		for(int i = 0; number>0; i++) {
			binaryInt = (int) (binaryInt + (number%2)*(Math.pow(10, i)));
			number = number/2;
		}
		String binaryStr = Integer.toString(binaryInt);
		return binaryStr;
	}

}
