package telran.numbers;

public class IntegerPrimitives {

	public static byte getMaxByte() {
		byte res = 1;
		while(res>0) {
			res*=2;
		}
		return (byte) (res-1);
	}

	public static byte getMinByte() {
		return (byte) (getMaxByte()+1);
	}

	public static int getLengthByte() {
		long max = getMaxByte();
		int res = getLength(max);
		return res;
	}

	public static char getMaxChar() {
		char res = 1;
		while(res>0) {
			res = (char) (res*2);
		}
		return (char) (res-1);
	}

	public static char getMinChar() {
		return (char) (getMaxChar()+1);
	}

	public static int getLengthChar() {
		long max = getMaxChar();
		int res = getLength(max);
		return res;
	}

	public static short getMaxShort() {
		short res = 1;
		while(res>0) {
			res=(short)(res*2);
		}
		return (short)(res-1);
	}

	public static short getMinShort() {
		return (short) (getMaxShort()+1);
	}

	public static int getLengthShort() {
		long max = getMaxShort();
		int res = getLength(max);
		return res;
	}

	public static int getMaxInt() {
		int res = 1;
		while(res>0) {
			res*=2;
		}
		return res-1;
	}

	public static int getMinInt() {
		return getMaxInt()+1;
	}

	public static int getLengthInt() {
		long max = getMaxInt();
		int res = getLength(max);
		return res;
	}

	public static long getMaxLong() {
		long res = 1;
		while(res>0) {
			res*=2;
		}
		return res-1;
	}

	public static long getMinLong() {
		return (long) (getMaxLong()+1);
	}

	public static int getLengthLong() {
		long max = getMaxLong();
		int res = getLength(max);
		return res;
	}
	private static int getLength(long x) {
		int count = 1;
		while(x>0) {
			x/=2;
			count++;
		}
		return count/8;
	}
	
}
