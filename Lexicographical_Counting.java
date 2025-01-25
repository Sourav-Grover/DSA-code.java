import java.util.*;
public class Lexicographical_Counting{
    public static void main(String [] args){
        List<Integer> ll = new ArrayList<>();
        int n = 1000;
        Counting(0, n, ll); // i.e. we have write from 0 to 1000 in lexicographic order.
        System.out.println(ll);
    }
    public static void Counting(int curr, int n, List<Integer> ll){ // curr means current i.e. jisme present value store ha.
        if(curr > n){
            return; // exits the program immediately and returns back to recursion call.
        }
        ll.add(Integer.valueOf(curr)); 
        int i = 0;
        if(curr == 0){
            i = 1;
        }
        for(; i <= 9; i++){
            Counting(curr * 10 + i, n, ll);
            
        }
    }
}
