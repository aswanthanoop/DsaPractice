package ses2;
import java.util.*;

public class leadersInAnArray {
    public static ArrayList<Integer> leader(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int max = nums[n-1];
        list.add(max);
        for(int i = n-1;i>=0;i--){
            if(nums[i]>max){
                max = nums[i];
                list.add(max);
            }
            
        }
        Collections.reverse(list);
        return list;


       
        
    }
    public static void main(String[] args) {
        int[] a = {7,0,1,10,3,5,2};
        ArrayList<Integer> b = leader(a);
        System.out.println(b);

    }

}
