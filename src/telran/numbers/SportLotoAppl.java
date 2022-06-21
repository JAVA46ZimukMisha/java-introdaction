package telran.numbers;

public class SportLotoAppl {
//Task 4
	public static void main(String[] args) {
		int res[]=new int[7];
		for(int i = 0; i<res.length; i++) {
			int number;
			do {
			number = getRandomNumber(1,49);
			}while(indexOf(res, number)>=0);
			res[i]=number;
			System.out.println(res[i]);
		}
	}
	private static int getRandomNumber(int min, int max) {
		return (int) (min+Math.random()*(max-min+1));
	}
	public static int indexOf(int ar[], int number) {
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
