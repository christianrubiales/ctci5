package ctci5._17moderate;

public class SwapNumbers {

	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 2;
		
		a ^= b;
		b ^= a;
		a ^= b;
		
		System.out.println(a + " " + b);
	}

}
