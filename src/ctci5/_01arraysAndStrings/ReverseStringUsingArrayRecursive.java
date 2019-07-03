package ctci5._01arraysAndStrings;

public class ReverseStringUsingArrayRecursive {

	static String reverse(String s) {
		return new String(reverse(s.toCharArray(), 0, s.length() - 1));
	}
	
	static char[] reverse(char[] A, int start, int end) {
		if (start < end) {
			char t = A[start];
			A[start] = A[end];
			A[end] = t;
			return reverse(A, ++start, --end);
		}
		
		return A;
	}
	

	public static void main(String[] args) {
		System.out.println(reverse("12345"));
	}

}
