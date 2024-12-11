import java.util.Scanner;

public class Book_allocation_problem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // for t no. of trials.
        while(t--  >  0){ // here post decrement is used in t--
              
        int nob = sc.nextInt(); // nob means no. of books
        int nos = sc.nextInt();// no. of students
        int []page = new int[nob]; // we are using binary search on sorted array vala pages
        
        for(int i = 0; i < page.length; i++){
            page[i] = sc.nextInt(); // taking page vale array ka input
        }
        System.out.println(MinPages(page, nos));
    }
    }
    public static int MinPages(int []page, int nos){
        int lo = 0;
        int hi = 0; // we need high as sum of all elements/pages for that we use loop.
        for(int i = 0; i<page.length; i++){
            hi += page[i];
        }
        // Now we use binary search.
        int ans = 0;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(isitpossible(page,nos,mid) == true){
                ans = mid;
                // Now we want to minimize this answer.
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] page, int nos, int mid){  // We use boolean here since it will return either true or false.
       int student = 1;
       int readpage = 0;
       for(int i = 0; i<page.length; ){ // We can use i loop in for loop or at last as we have already learnt.
            if(readpage + page[i] <= mid){
                readpage += page[i];
                i++;
            }else{
                student++;
                readpage = 0;
            }
            if(student>nos){
                return false;
         }
     }
    return true;
}
}
