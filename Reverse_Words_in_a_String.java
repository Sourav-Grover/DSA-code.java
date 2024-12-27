public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = "    hello    world    bye    India     cows";
        s = s.trim();
        String[] arr = s.split(" +");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i] + " ";
        }
        System.out.print(ans.trim());
    }
}
