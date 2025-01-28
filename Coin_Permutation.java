public class Coin_Permutation{
    public static void main(String [] args){
        int [] coin = {2,3,5};
        int amount = 7;
        Permutation(coin, amount, "");
    }
    
    public static void Permutation(int [] coin, int amount, String ans){
        if(amount == 0){
            System.out.println(ans + " ");
            return;
        }
        int n = coin.length;
        for(int i = 0; i < n; i++){
            if(amount >= coin[i]){
                Permutation(coin, amount - coin[i], ans + coin[i]);
            }
        }
    }
}
