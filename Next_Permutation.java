/*example: 6
4 5 8 1 3 2 
expected output: 4 5 8 2 1 3
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int n = y.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = y.nextInt();
        }
        y.close();

        Permutation(n, arr);
    }
    public static void Permutation(int n, int[] arr) {
        boolean isPermutationFound = false;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) { 
                int temp = arr[i - 1];
                int j = n - 1;
                while (arr[j] <= arr[i - 1]) {
                    j--;
                }
                arr[i - 1] = arr[j];
                arr[j] = temp;
                Reverse(arr, i, n - 1);
                isPermutationFound = true;
                break;
            }
        }
        if (!isPermutationFound) {
            Arrays.sort(arr);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void Reverse(int[] arr, int x, int n) {
        int si = x;
        int ei = n;
        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
}
