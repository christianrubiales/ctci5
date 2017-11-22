package ctci5._01arraysAndStrings;

public class IsRotation {
	
	static boolean isRotation(String s1, String s2) {
		if (s1 == null && s2 == null) {
			return true;
		}
		if (s1.length() != s2.length()) {
			return false;
		}
		
		return isSubstring(s1, s2+s2);
	}
	
	static boolean isSubstring(String s1, String s2) {
		return s2.contains(s1);
	}

	public static void main(String[] args) {
		System.out.println(isRotation(null, null));//true
		System.out.println(isRotation("erbottlewat", "waterbottle"));//true
		System.out.println(isRotation("abcd", "dabc"));//true
		System.out.println(isRotation("", ""));//true
		System.out.println(isRotation("123", "1234"));//false
		System.out.println(isRotation("abcd", "dcba"));//false
	}

}
