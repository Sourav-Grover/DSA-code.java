// COunting prie number from 1 to 100;
public class Sieve_Algo{
    public static void main(String [] args){
        int n = 100;
        System.out.println(CountPrime(n));
    }
    // index par 0 karne ka matlab index prime number ha
    // index par 0 karne ka matlab index prime number nhii ha
    public static int CountPrime(int n){
        if(n < 2){ 
          return 0;  // i.e.exit the method
        }
        int [] prime = new int[n+1];
        prime[0] = 1; // not prime
        prime[1] = 1; // not prime
        for(int i = 2; i*i <= n; i++){
            if(prime[i] == 0){
                for(int j = 2; i*j <  prime.length; j++){
                    prime[i*j] = 1;
                }
            }
        }        
      // if we want to print then rather than counting, print it in the below loop instead of counting by print statement

        int ans = 0;
        for(int i = 2; i < prime.length; i++){
            if(prime[i] == 0){
                ans++;
            }
        }
        return ans;
    }
}
