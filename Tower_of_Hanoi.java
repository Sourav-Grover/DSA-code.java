public class Tower_of_Hanoi {
	public static void main(String[] args) {
		String src = "A"; // src: source
		String hlp = "B"; // hlp: helper
		String des = "C"; // des: destination
		int n = 3;
		TOH(n, src, hlp, des);
	}
	public static void TOH(int n, String src, String hlp, String des) {
		if (n == 0) {
			return;
		}
		TOH(n - 1, src, des, hlp);
		System.out.println("Move " + n + "th disk from " + src + " to " + des);
		TOH(n - 1, hlp, src, des);
	}
}
