package ctci5._17moderate;

public class SwapNumbers2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println(a + " " + b);
	}

}
