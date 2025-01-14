public class Missing_Number{
    public static void main(String [] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMissing(nums));
    }
    public static int findMissing(int [] nums){
        int i = 0;
            int n = nums.length;
        while (i < n) { // Fix: Use i < n instead of i <= nums.length
            boolean found = false; // Track if i is found in the array

            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break; // Exit the loop once i is found
                }
            }

            if (!found) {
                return i; // Return i if it's not found
            }

            i++;
        }

        return n; // If all numbers from 0 to n-1 are found, the missing number is n
    }
}
