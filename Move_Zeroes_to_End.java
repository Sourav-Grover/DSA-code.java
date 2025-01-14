import java.util.Arrays;

public class Move_Zeroes_to_end {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        // For example, input: [0], output: [0]
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int j = i + 1;

                // Find the next non-zero element to swap
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }

                // Swap if a non-zero element is found
                if (j < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums)); // Corrected print statement
    }
}
