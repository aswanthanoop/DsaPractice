package ses3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class diffBetweenOddEven {

    public static int diference(int n){
        ArrayList<Integer> result = new ArrayList<>();
        while(n>0){
            int a = n%10;
            n/= 10;
            result.add(a);

        }
        int even = 0;
        int odd = 0;
        Collections.reverse(result);
        int size = result.size();
        for(int i = 0;i<size;i++){
            if(i%2 == 0){
                even += result.get(i);
            }
            else{
                odd += result.get(i);
            }
        }
        int res = Math.abs(even - odd);
        return res;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();
        int answer = diference(a);
        System.out.println(answer);
        sc.close();


    }
    
}
