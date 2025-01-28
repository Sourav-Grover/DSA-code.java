public class Coin_Combination{
    public static void main(String [] args){
        int [] coin = {2,3,5};
        int amount = 7;
        Combination(coin, amount, "", 0);
    }
    
    public static void Combination(int [] coin, int amount, String ans, int idx){
        if(amount == 0){
            System.out.println(ans + " ");
            return;
        }
        int n = coin.length;
        for(int i = idx; i < n; i++){
            if(amount >= coin[i]){
                Combination(coin, amount - coin[i], ans + coin[i], i); 
            }
        }
    }
}
