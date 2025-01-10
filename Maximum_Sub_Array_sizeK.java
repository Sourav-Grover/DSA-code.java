public class Sliding_Window{
    public static void main(String [] args){
        int [] arr = {2,3,4,1,2,3,7,6,8,2,3};
        int k = 3;
        System.out.println(arr_sum(arr) - Maximum_Sum(arr,k));
    }
    public static int Maximum_Sum(int []arr, int k){
        int sum  = 0;
        // 1st Window
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        int ans = sum;
        for(int i = k; i < arr.length; i++){
            // growing
            sum = sum + arr[i]; 
            // shrinking
            sum -= arr[i - k];
            // ans update
            ans = Math.max(sum,ans);
        }
        return ans;
    }
    public static int arr_sum(int []arr){
        int totalsum = 0;
        for(int i = 0; i < arr.length; i++){
            totalsum += arr[i];
        }
        return totalsum;
    }
}
