package ses2;

import java.util.Arrays;

public class kRotation {
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
    public static int[] rotation(int[] arr, int k){
        int n = arr.length;
        reverse(arr,0,k);
        reverse(arr,k+1,n-1);
        reverse(arr,0,n-1);
        return arr;            
        }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] ans = rotation(arr,3);
        System.out.println(Arrays.toString(ans));
    }
}

    

