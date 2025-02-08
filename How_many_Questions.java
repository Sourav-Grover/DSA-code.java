import java.util.Scanner;
public class How_many_Questions{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] P = new int[n]; // Petya
        int [] V = new int[n]; // Vasya
        int [] T = new int[n]; // Tonya
        for(int i = 0; i < n; i++){
            P[i] = sc.nextInt();
            V[i] = sc.nextInt();
            T[i] = sc.nextInt();
        }
        System.out.println(Counting(n, P, V, T)); 
       
    }
    public static int Counting(int n, int [] P, int [] V, int [] T){
        
            int count = 0;
            for(int i = 0; i < n; i++){
                int ans = 0;
                if(P[i] == 1){
                    ans++;
                }
                if(V[i] == 1){
                    ans++;
                }
                if(T[i] == 1){
                    ans++;
                }
                if(ans > 1){
                    count++;
                }
            }
            return count;
        }
}
