class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int o = m + n; // merge array length
        int [] merge = new int[o];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                merge[index++] = nums1[i++];
            }
            else if(nums1[i] > nums2[j]){
                merge[index++] = nums2[j++];
            }
            else{
                merge[index++] = nums1[i];
                i++;
            }
        }
            while(i < m){
                merge[index++] = nums1[i++];
            }
            while(j < n){
                merge[index++] = nums2[j++];
            }
            
        
            if(o%2 != 0){ // odd length
                return merge[o/2];
            }
            else{ // even length
                return (merge[o/2 - 1] + merge[o/2])/2.0;
            }
            
        
    }
}
