// Check_Prime with "root n" time complexeity(Effective approach)

public class Check_Prime{
    public static void main(String [] args){
        System.out.println(Isprime(57));
    }
    public static boolean Isprime(int n){
        int i = 2;
        while(i * i <= n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
