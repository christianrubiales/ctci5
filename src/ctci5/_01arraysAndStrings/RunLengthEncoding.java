package ctci5._01arraysAndStrings;

public class RunLengthEncoding {
	
	static String encode(String s) {
		// short-circuit checking
		if (s == null || s.length() == 0) {
			return s;
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
			return s;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i += 2) {
			char c = s.charAt(i);
			int count = s.charAt(i+1) - '0';
			
			for (int j = 0; j < count; j++) {
				sb.append(c);
			}
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
	}

}
