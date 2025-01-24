public class Subsequence_Count{
    public static void main(String [] args){
        String str = "abc";
        System.out.println("\n" + CountSubSeq(str, ""));
    }
    static int count = 0;
    public static int CountSubSeq(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return 1;
        }
        char ch = ques.charAt(0);
        int x = CountSubSeq(ques.substring(1), ans);
        int y = CountSubSeq(ques.substring(1), ans + ch);
        return x+y;
    }
}
