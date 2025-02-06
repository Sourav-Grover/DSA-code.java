import java.util.Random;
public class Quick_Sort {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		Sort(arr, 0, arr.length - 1);
		// With below loop, it is confirmed that in Quick Sort, whatever the changes we made in done to the original array. There is no requirement of any other new array, changes(Sorting) will directly reflect in the original array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Sort(int[] arr, int si, int ei) {
		if (si >= ei) {
			return;
		}
		int idx = Partition(arr, si, ei);
		Sort(arr, si, idx - 1);
		Sort(arr, idx + 1, ei);
	}
	public static int Partition(int[] arr, int si, int ei) {
	    Random rn = new Random();
	    int ri = rn.nextInt(ei - si) + si;
	    int t = arr[ei];  // or use temp instead of "t"
	    arr[ei] = arr[ri];
	    arr[ri] = t;
		int item = arr[ei];
		int idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] <= item) {
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
				idx++;
			}
		}
		int temp = arr[idx];
		arr[idx] = arr[ei];
		arr[ei] = temp;
		return idx;
	}
}
