public class Transpose_of_Matrix{ // Matrix means 2D array
    public static void main(String[] args){
        int [] [] arr = {{10,20,30,40},{50,60,70,80},{11,12,13,14},{21,22,23,34}};
// NOTE: This code logic is only for square matix. For another type matrices with different number of rows and column, create another suitable logic by doing parallely dry run while writing suitable code.
    Transpose(arr);
    for(int i = 0; i<arr.length; i++){
        for(int j = 0;j<arr.length; j++){
            System.out.print(arr[i][j] + " ");
    }
        System.out.println(); // used for going to next row of matrix
    }
}

public static void Transpose(int [][] arr){
    for(int i = 0;i<arr.length;i++){
        for(int j = i + 1; j<arr[0].length;j++){
            int temp = arr[i] [j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }
}
}

// output:
10 50 11 21 
20 60 12 22 
30 70 13 23 
40 80 14 34 
