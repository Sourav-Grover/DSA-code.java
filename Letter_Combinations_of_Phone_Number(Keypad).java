import java.util.*;
public class Key_Pad {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
        if (digits.length() == 0) {
            return ll;
        }
        String ques = "238";
        Print(ques, "", ll);
        System.out.println(ll);
    }
    public static void Print(String ques, String ans, List<String> ll) {
        if (ques.length() == 0) {
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String press = key[ch - '0'];
        for (int i = 0; i < press.length(); i++) {
            Print(ques.substring(1), ans + press.charAt(i), ll);
        }
    }
}
