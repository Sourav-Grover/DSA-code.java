public class Print_Substring_length_wise {
    public static void main(String[] args) {
        String str = "coding";
        Print(str);
    }

    public static void Print(String s) {
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
}
