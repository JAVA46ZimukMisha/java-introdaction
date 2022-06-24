package telran.numbers;

public class ArrayInt {
	//HW#4 
	
public static void sort(int[] ar) {
	boolean isSorted;
	for(int i = 0; i< ar.length; i++) {
		isSorted = moveMaxToEnd(ar, i);
		if(isSorted){
			break;
		}
	}
	
}
private static boolean moveMaxToEnd(int[] ar, int iter) {
	boolean fl = true;
	for(int i = 1; i<ar.length-iter; i++) {
		if(ar[i-1]>ar[i]) {
			swap(ar, i);
			fl = false;
		}
	}
	return fl;
	}
private static void swap(int[] ar, int index) {
	int tmp = ar[index-1];
	ar[index-1]=ar[index];
	ar[index]=tmp;
}

public static int binaryIndexOf(int[] ar, int number) {
	int left = 0, right = ar.length - 1, middle = ar.length/2, res, index = -1;
	while(left<=right) {
		if(ar[middle]<number) {
			left = middle+1;
		} else {
			right = middle - 1; 
			if(ar[middle]==number) {
				index=middle;
			}
		}
		middle = (left+right)/2;
	}
	if(index>=0) {
		res=index;
	}else {
		if(middle>0) {
			res = (middle+2)*(-1);
		}else {
			res = (middle+1)*(-1);
		}
	}
	return res;
}

}
