// package ses2;
import java.util.*;

public class diffBetweenOddEven {
    public static void main(String[] args){
        int a = 123456;
        ArrayList<Integer> list = new ArrayList<>();
         while (a>0){
            list.add(a%10);
            a/=10;

         }
         Collections.reverse(list);
         int odd = 0;
         int even = 0;
         for(int i = 0;i<list.size();i++){
            if(i % 2 == 0){
                even+= list.get(i);

            }
            else{
                odd+= list.get(i);
            }
               
         }
         int res = odd-even;
         System.out.println("odd "+ Math.abs(odd));
         System.out.println("even "+ Math.abs(even));

         System.out.println("difference "+ Math.abs(res));
       
    }
    
}
// 1 2 3 4 5 6 