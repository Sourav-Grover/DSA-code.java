class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int m = arr.length;
        int []temp = new int[m];
        int x = 0;
        if(d>=m){
            d = d%m;
        }
        for(int i=d; i<m; i++){
            temp[x] = arr[i];
            x++;
            }
        for(int i=0; i<d; i++){
            temp[x] = arr[i];
            x++;
        }
System.arraycopy(temp, 0, arr, 0, m);
    
    }
}
