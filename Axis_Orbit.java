// Axis_Orbit Palindrome_Concept


public class Axis_Orbit {

	public static void main(String[] args) {
		String s = "nitin";
		System.out.println(Palindromic(s));

	}

	public static int Palindromic(String s) {
		int odd = 0;
		// odd 
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if (s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
					break;
				}
				odd++;
			}

		}
		int even = 0;
		// even
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if (s.charAt((int) (axis - orbit)) != s.charAt((int) (axis + orbit))) {
					break;
				}
				even++;
			}

		}
// 		all(even + odd) palindromes
		return odd + even;

	}

}
