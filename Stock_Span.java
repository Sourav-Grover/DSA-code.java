import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		int[] arr = { 30, 35, 40, 38, 35 };
		Cal_Span(arr);

	}

	public static void Cal_Span(int[] arr) {

		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
				st.pop();
			}
			if (!st.isEmpty()) {

				ans[i] = i - st.peek();
			} else {
				ans[i] = i + 1;
			}
			st.push(i);
		}
		// Printing span of all elements
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}

	}

}
