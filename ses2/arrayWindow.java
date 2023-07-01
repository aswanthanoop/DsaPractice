package ses2;
import java.util.*;

public class arrayWindow {
    public static ArrayList<Integer> window(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int start = 0;
        int end = n - 1;
         while(start < end && arr[start] < arr[start + 1]){
            start++;
         }
         while(end > start && arr[end] > arr[end  - 1]){
            end--;
         }
         if(start == n - 1){
            System.out.println("Array is already Sorted.");
         }
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         for(int i = start;i<end;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
         }



         while(start < end  && arr[start - 1]>min){
            start--;

         }
         while(end > start && arr[end+1]< max){
            end++;
         }
         list.add(start);
         list.add(end);

         return list;


    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,10,8,13,12,18,19};
        ArrayList<Integer> ans = window(arr);
        System.out.println(ans);
    }
    
}


