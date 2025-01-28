import java.util.ArrayList;
import java.util.List;
public class Coin_Combination{
    public static void main(String [] args){
        int [] coin = {2,3,5};
        int amount = 7;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Combination(coin, amount, ll, 0, ans);
        System.out.println(ans);
    }
    
    public static void Combination(int [] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans){
        if(amount == 0){
            ans.add(new ArrayList<>(ll)); // Creates a copy of the original Array List by "new" keyword and add output i.e. "ans" to it.
            return; // exits the method and returns to the place where it is being called i.e. the recursive call.
        }
        int n = coin.length;
        for(int i = idx; i < n; i++){
            if(amount >= coin[i]){
                ll.add(coin[i]);
                Combination(coin, amount - coin[i], ll, i, ans); // we have passed i not i + 1 to idx since there is infinite supply of coins
                ll.remove(ll.size()-1); // undo operation by backtracking
                
            }
        }
    }
}
