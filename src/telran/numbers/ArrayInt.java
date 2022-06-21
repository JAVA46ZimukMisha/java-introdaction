package telran.numbers;

import java.util.Arrays;

public class ArrayInt {
	//HW#3 
	//Task 1
public static int[] addNumber(int ar[], int number) {
	int res[] = Arrays.copyOf(ar, ar.length+1);
	res[res.length - 1] = number;
	return res;
}
	//Task 2
public static int[] insertNumber(int ar[], int index, int number) {
	int []res = new int[ar.length+1];
	System.arraycopy(ar, 0, res, 0, index);
	res[index]=number;
	System.arraycopy(ar, index, res, index+1, ar.length-index);
	return res;
}
	//Task 3
public static int[] removeNumber(int ar[], int index) {
	int []res = new int[ar.length-1];
	System.arraycopy(ar, 0, res, 0, index);
	System.arraycopy(ar, index+1, res, index, ar.length-1-index);
	return res;
}
public static int indexOf(int ar[], int number) {
	// return if the given number exist in the given array then returns the index of first occurrence, otherwise  return -1
	int res = -1;
	for(int i=0; i<ar.length; i++) {
		if(ar[i]==number) {
			res = i;
			break;
		}
	}
	return res;
}
}
