package ctci5._01arraysAndStrings;

public class ReverseStringUsingArray {
	
	static String reverse(String s) {
		char[] c = s.toCharArray();
		
		for (int i = 0; i < c.length / 2; i++) {
			char t = c[i];
			c[i] = c[c.length - i - 1];
			c[c.length - i - 1] = t;
		}
		
		return new String(c);
	}

	public static void main(String[] args) {
		System.out.println(reverse("12345"));
	}

}
