import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows{
    // example: 5stalls = {1,2,8,4,9} , cows = 3
    // we use binary search since distance line is sorted like 0 to 8 distance sorted way me increase hoti ha (as 0,1,2,3,4,5,6,7,8) not because array will be sorted.
    public static void main ( String[]args){
        Scanner sc = new Scanner(System.in);
        // the below two lines one is taking t as input and other is while loop of t is for t no. of cases
        int t = sc.nextInt();
        while(t>0){
        int n = sc.nextInt();  // n: no. of stalls
        int c = sc.nextInt();  // c: no. of cows
        int [] stall = new int[n]; // taking stall vala array. We can also use arr or etc. any array name other than stall
        for(int i = 0; i < stall.length; i++){ // taking loop for position of stall
            stall [i] = sc.nextInt();
        }
        Arrays.sort(stall); // By this our array gets automatically sorted, no need to use bubble sort etc,
        System.out.println(largest_distance(stall,c));
        t--; 
    } // here while loop of t ends.
    }
    
    public static int largest_distance(int []stall, int c){ // jo jo bhii hame function ko dena hota ha/ pass karna hota ha vo ham yahan bracket me likhte ha.
        int n = stall.length;
        int lo = 0;
        int hi = stall[n-1] - stall[0]; // eg: 9-1 = 8
        int ans= 0;
        while(lo <= hi){
            int mid = (lo + hi)/2; // eg: 0+8 / 2 = 4
            if (isitpossible(stall,c,mid) == true){ // eg:  is it possible to adjust 3 cows at minimum distance 4(i.e. mid value): NO therefore else part works
                // i.e. if it is possible (i.e. true)for the no. of stalls, cows, and mid
                ans = mid;
                lo = mid + 1;
        }
            else{
                hi = mid - 1;
        }
        } 
        return ans;
        }
        public static boolean isitpossible(int []stall,int c,int mid){
        int cow = 1; // i.e. initially taking 1 cow.
        int pos = stall[0]; // i.e. first cow ki position will be at i = 0
        for(int i = 1; i<stall.length; i++){ // we will start from 0 for 2nd cow and 1st cow to i = 0 of stall par beth gayi ha
            if(stall[i] - pos >= mid){ // then cow ko bitha do
                cow++;
                pos = stall[i];
            }
            if(cow  == c){
                return true; // i.e. jitni bithani thi utni beth gayi;
            }
        }
    return false; // i.e. ham sarri cows nhii bithaye paye.
        }
}
