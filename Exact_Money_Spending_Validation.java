import java.util.Scanner;
import java.util.Arrays;
public class Alex_Goes_Shopping{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] prices = new int[n];
        for(int i = 0; i < n; i++){
        prices[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int [] A = new int[q];
        int [] k = new int [q];
        for(int i = 0; i < q; i++){
            A[i] = sc.nextInt();
            k[i] = sc.nextInt();
        }
        YesNo(n, prices, q, A, k);
    }
    public static void YesNo(int n, int [] prices, int q, int [] A, int [] k){
        for(int i = 0; i < q; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(A[i] % prices[j] == 0){ // all money must be spent on one kind of item
                    count++;
                }
            }
            if(count >= k[i]){ // at least k items
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
