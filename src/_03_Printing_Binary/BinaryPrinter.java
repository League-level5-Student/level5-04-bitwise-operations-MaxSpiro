package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		
	}
	public static void printByteBinary(byte b) {
		int bin = 0;
		while(b>0) {
			bin+=b%2;
			b/=2;
			bin*=10;
		}
		System.out.println(bin);
	}
	
	public static void printShortBinary(short s) {
		int bin = 0;
		while(s>0) {
			bin+=s%2;
			s/=2;
			bin*=10;
		}
		System.out.println(bin);
	}
	
	public void printIntBinary(int i) {
		int bin = 0;
		while(i>0) {
			bin+=i%2;
			i/=2;
			bin*=10;
		}
		System.out.println(bin);
	}
	
	public void printLongBinary(long l) {
		int bin = 0;
		while(l>0) {
			bin+=l%2;
			l/=2;
			bin*=10;
		}
		System.out.println(bin);
	}
}

