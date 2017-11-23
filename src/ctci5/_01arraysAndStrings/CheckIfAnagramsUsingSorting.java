package ctci5._01arraysAndStrings;

import java.util.Arrays;

// O(nlogn) time, O(n) space
public class CheckIfAnagramsUsingSorting {
	
	static boolean areAnagrams(String x, String y) {
		// short-circuit checking
		if (x == null && y == null) {
			return true;
		}
		if (x.length() != y.length()) {
			return false;
		}
		
		char[] cx = x.toCharArray();
		char[] cy = y.toCharArray();
		Arrays.sort(cx);
		Arrays.sort(cy);
		
		for (int i = 0; i < cx.length; i++) {
			if (cx[i] != cy[i]) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(areAnagrams(null, null));// true
		System.out.println(areAnagrams("12345", "54321"));// true
		System.out.println(areAnagrams("12345", ""));// false
		System.out.println(areAnagrams("12345", "11111"));// false
	}

}
