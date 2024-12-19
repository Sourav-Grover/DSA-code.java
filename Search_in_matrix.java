public class Matrix_Search {
    public static void main(String[] args){
        int [] [] arr = { {1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{18,21,23,26,30}};
            System.out.println(Search(arr,27));
        }
        public static boolean Search(int [] [] arr, int item){
            // We have to take the last most corner element of first row i.e. (0,n)
            int row = 0;
            int col = arr[0].length - 1; // not just arr.length as indexing starts from 0 not 1 i.e. first element is 0 not 1 therefore -1 is required.
            while(row < arr.length && col >= 0){ // since we are starting searching i.e. lopp from right most element.
                if(arr[row][col] == item){
                    return true; // not True i.e. t will be small
                }
                else if(arr[row][col] > item) {
                    col --;
                }
                else{
                    row++;
                }
            }
                return false; // i.e. agar kuch nhii hua to return false i.e. element present nhii ha
        
    }
}

/* Input     output
    16         true
    27         false
*/
