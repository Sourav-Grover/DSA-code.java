public class Subarray_Product_less_than_K{
    public static void main(String [] args){
        int []arr = {10, 5, 2, 6};
        int k = 100;
        System.out.println(ProductLessThanK(arr, k));
    }
    public static int ProductLessThanK(int[] arr, int k){
        int si = 0; // si represents starting index
        int ei = 0; // si represents ending index
        int count = 0;
        int prod = 1;
        while(ei < arr.length){
            // grow
            prod = prod * arr[ei];
            // shrink
            while(prod >= k && si <= ei){
                prod /= arr[si];
                si++;
            }
            // ans(i.e. count) calculate
            count = count + (ei - si + 1); 
            ei++;
        }
        return count;
}
}
