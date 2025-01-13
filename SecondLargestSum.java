import java.util.Arrays;
public class SecondLargestSum {
    public static void main(String[] args) {
        int [] arr = {12, 35, 1, 10, 34, 1};
        int [] temp = Sort(arr);
                
        System.out.println(SecondLastElement(temp));
    }
    public static int[] Sort(int [] arr){
        Arrays.sort(arr);
            return arr;
    }
    public static int SecondLastElement(int [] temp){
        int n = -1;
        for(int i = temp.length - 1; i > 0; i--){
            if(temp[i] != temp[i-1]){
                n = temp[i-1];
                break;
            }
            }
            return n;

}
}
