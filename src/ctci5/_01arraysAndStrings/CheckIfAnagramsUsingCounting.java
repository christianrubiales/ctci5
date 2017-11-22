package ctci5._01arraysAndStrings;


public class CheckIfAnagramsUsingCounting {
	
	static boolean areAnagrams(String x, String y) {
		if (x == null && y == null) {
			return true;
		}
		if (x.length() != y.length()) {
			return false;
		}
		
		int MAX = 65535;
		int[] counts = new int[MAX];
		
		for (int i = 0; i < x.length(); i++) {
			counts[x.charAt(i)]++;
		}
		
		for (int i = 0; i < y.length(); i++) {
			counts[y.charAt(i)]--;
			if (counts[y.charAt(i)] < 0) {
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
