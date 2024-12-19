public class Maximum_Sum_Path{
    public static void main(String[] args){
        int m = 5;  // size of array 1. By this m, we don't have to do "arr1.length" everywhere for usimg array 1 length, just use m in place of arr1.length
        int [] arr1 = {2,3,7,10,12};
        int n = 4;  // or write this line just before int m = 5.
        int [] arr2 = {1,5,7,8};   // size of array 2
        System.out.print(maxpath(arr1,arr2, m,n));
    }
    public static int maxpath(int [] arr1, int [] arr2, int m, int n){
        int i = 0;
        int j = 0;
        int s1 = 0;
        int s2 = 0;
        int ans = 0;
        while(i<m && j<n){   //  we take && not  || as koi ek "bhii" array khatam hote hee hone tak hame ye loop chalana ha. i.e. both conditions must be true to run the loop
            if(arr1[i] < arr2[j]){  // arr1[i] means i th element of array 1
                s1 += arr1[i++];  // or do s1 += arr1[i] and i++ in different lines i.e. we can directly use i++ in place of i of arr1[i]. Similarly for j. as post decrement ha therefore pehle element use hoga then plus hoga
            }
            else if(arr1[i] > arr2[j]){
                s2 += arr2[j++];
            }
            else{  // i.e. arr1[i] == arr2[j]
                ans = ans + Math.max(s1,s2) + arr1[i];  // or use arr2[j] as we want the common/same element, and since at this point arr1[i] == arr[j]
                s1 = 0;
                s2 = 0;
                i++;
                j++;
            }
            // we come out of these while loop when any one array ends and then goes to below while loops.
    }
        while(i<m){  // works if j loop has ended and i loop is left
            s1 += arr1[i++];
        }
        while(j<n){     // works if i loop has ended and j loop is left
            s2 += arr2[j++];
        }
        ans = ans + Math.max(s1,s2); // will add the previous saved answer from upper while loops to the maximum of s1 and s2
        return ans;        // this will return the final ams of whole "maxpath" method to the main method.
    }
    
}

// Output : 35
