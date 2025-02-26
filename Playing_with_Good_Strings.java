import java.util.Scanner;

public class Playing_with_good_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longest_Good_Strings(s));
    }

    public static int longest_Good_Strings(String s) {
        int ans = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isvowels(ch)) {
                c++;
            } else {
                ans = Math.max(c, ans);
                c = 0;
            }
        }
        ans = Math.max(c, ans);
        return ans;
    }

    public static boolean isvowels(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
