public class Generate_Parenthesis {
    public static void main(String[] args) {
        int n = 3;
        Parenthesis(n, 0, 0, "");
    } 

    public static void Parenthesis(int n, int open, int close, String ans) {
        if (open == n && close == n) {
            System.out.print(ans + " ");
            return;
        }
        if (open > n || close > open) {
            return;
        }
        
        Parenthesis(n, open + 1, close, ans + "(");
        Parenthesis(n, open, close + 1, ans + ")");
    }
}
