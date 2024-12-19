import java.util.Scanner;

public class Calculate_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            temp[i] = A[i];
        }
        int Q = in.nextInt();
        while (Q-- > 0) {
            int X = in.nextInt();
            for (int i = 0; i < n; i++) {
                int r = i - X;
                if (r < 0) {
                    r = n + r;
                }
                A[i] += temp[r];
            }
            for (int i = 0; i < n; i++) {
                temp[i] = A[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        System.out.println(sum);
    }
}
