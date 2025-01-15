class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length;
        int n = nums2.length;
        int [] temp = new int[Math.min(m, n)];
        int index = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(nums1[i] == nums2[j]){
                    // Avoiding addition of duplicates
                    if(index == 0 || temp[index-1] != nums1[i]){ // or use nums2[j]
                    temp[index++] = nums2[j];  // or use nums1[i]
                }
                break;
            }
            }
        }
        // Trim the array to the correct size.
        int []result = new int[index];
        for(int k = 0; k < index; k++){
            result[k] = temp[k];
        }
        return result;
    }
}
