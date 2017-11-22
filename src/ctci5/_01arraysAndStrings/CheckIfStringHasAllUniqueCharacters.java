package ctci5._01arraysAndStrings;

// O(n) time, O(1) space
// Java char is 16-bit
public class CheckIfStringHasAllUniqueCharacters {
	
	static boolean hasAllUnique(String s) {
		final int MAX = 65535;
		if (s.length() > MAX) {
			return false;
		}
		
		boolean[] bitset = new boolean[MAX];
		for (int i = 0; i < s.length(); i++) {
			if (bitset[s.charAt(i)]) {
				return false;
			}
			bitset[s.charAt(i)] = true;
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(hasAllUnique(""));//true
		System.out.println(hasAllUnique("a"));//true
		System.out.println(hasAllUnique("abc"));//true
		System.out.println(hasAllUnique("aa"));//false
		System.out.println(hasAllUnique("aba"));//false
	}

}
