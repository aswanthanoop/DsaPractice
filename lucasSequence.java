package ses3;
import java.util.*;

public class lucasSequence {

    public static void lucasSeq(int[] arr){
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        
        int n = arr.length;
        for(int i = 3;i<n;i++){
            arr[i] = arr[i-3] + arr[i-2] + arr[i-1];

        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
        



    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of Array : ");
        int a = sc.nextInt();
        int[] array = new int[a];
        lucasSeq(array);
        sc.close();
        
        

    }
}