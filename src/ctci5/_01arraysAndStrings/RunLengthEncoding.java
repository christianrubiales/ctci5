package ctci5._01arraysAndStrings;

public class RunLengthEncoding {
	
	static String encode(String s) {
		// short-circuit checking
		if (s == null || s.length() == 0) {
			return s; // or IllegalArgumentException?
		}
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char c = s.charAt(0);
		
		for (int i = 1; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				count++;
			} else {
				sb.append(c).append(count);
				c = s.charAt(i);
				count = 1;
			}
		}
		sb.append(c).append(count);
		
		return sb.toString();
	}
	
	static String decode(String s) {
		// short-circuit checking
		if (s == null || s.length() == 0) {
			return s; // or IllegalArgumentException?
		}
		
		StringBuilder sb = new StringBuilder();
		boolean charFlag = true;
		char c = s.charAt(0);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (charFlag) {
				c = s.charAt(i);
			} else {
				while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					count = count * 10 + (s.charAt(i) - '0');
					i++;
				}
				i--;

				for (int j = 0; j < count; j++) {
					sb.append(c);
				}
				count = 0;
			}
			charFlag = !charFlag;
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String encoded = encode("aaabbc");
		System.out.println(encoded);
		System.out.println(decode(encoded));
		
		encoded = encode("c");
		System.out.println(encoded);
		System.out.println(decode(encoded));

		encoded = encode("aaaaaaaaaaacddbbbbbbbbbbbb");
		System.out.println(encoded);
		System.out.println(decode(encoded));

		encoded = encode("     ");
		System.out.println(encoded);
		System.out.println(decode(encoded));
	}

}
