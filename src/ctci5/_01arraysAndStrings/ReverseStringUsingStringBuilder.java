package ctci5._01arraysAndStrings;

public class ReverseStringUsingStringBuilder {
	
	static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(reverse("12345"));
	}

}
