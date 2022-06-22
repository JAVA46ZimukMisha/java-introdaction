package telran.numbers;

public class Add01 {
//	Longest Subsequence
//
//	Write method 
//	    public static int maxSubsequenceLength(int[] arr)
//		
//	The method accepts array of integers and returns 
//	the length of longest sub-sequence, consisting of repeating number.
//
//	For example, if input is
//	    1,3,3,2,8,8,8,5,6,6
//	the result is 3 - the length of longest subsequence 8,8,8
//
//	The non-repeating number would  be considered as "subsequence of length 1".
//	The result for empty array would be 0.
//
//	Think how to write it in one pass through array.
//
//	Implement the tests.
	public static int maxSubsequenceLength(int[] arr) {
		int length = arr.length>0 ? 1 : 0;
		for(int i = 1, count = 0; i<arr.length; i++, count++) {
			if(arr[i]!=arr[i-1] || i==arr.length-1) {
				if (length<count) {
					length=count;
				}
				count=0;
			}
		}
		return length;
	}
}
