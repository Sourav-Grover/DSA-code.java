import java.util.Scanner;

public class Max_Circular_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int curr_max = arr[0];
        int maxsf = arr[0];
        int curr_min = arr[0];
        int minsf = arr[0];
        for (int i = 1; i < n; i++) {
            curr_max = Math.max(curr_max + arr[i], arr[i]);
            maxsf = Math.max(curr_max, maxsf);
            curr_min = Math.min(curr_min + arr[i], arr[i]);
            minsf = Math.min(curr_min, minsf);
        }
        if (minsf == sum) {
            System.out.println(maxsf);
            return;
        }
        System.out.println(Math.max(maxsf, sum - minsf));
    }
}
