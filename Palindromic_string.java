import java.util.Scanner;
public class palindromic_string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Palindromic(s));
    }
    public static boolean Palindromic(String s){
        int i = 0;  
        int j = s.length() - 1;  
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
