package ctci5._01arraysAndStrings;

public class ReplaceSpacesInStrinng {
	
	static char[] replaceSpaces(char[] s) {
		int j = s.length - 1;
		int i = s.length - 1;
		while (s[i] == ' ') {
			i--;
		}
		
		while (i > -1) {
			if (s[i] != ' ') {
				s[j] = s[i];
				i--;
				j--;
			} else {
				s[j-2] = '%';
				s[j-1] = '2';
				s[j] = '0';
				i--;
				j -= 3;
			}
		}
		
		return s;
	}

	public static void main(String[] args) {
		System.out.println(new String(replaceSpaces("1 2  ".toCharArray())));
		System.out.println(new String(replaceSpaces(" 1 2    ".toCharArray())));
		System.out.println(new String(replaceSpaces("123 456 789    ".toCharArray())));
	}

}
