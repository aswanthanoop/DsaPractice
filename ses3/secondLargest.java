package ses3;

import java.util.*;

public class secondLargest{
    public static int secondLar(int nums){
        ArrayList<Integer> array = new ArrayList<>();
        
        while(nums>0){
            int a = nums%10;
            nums/=10;
            array.add(a);

        }
        ArrayList<Integer> Odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        Collections.reverse(array);
        int n = array.size();
        for(int i = 0;i<n;i++){
            if(i%2==0){
                even.add(array.get(i));
            }
            else{
                Odd.add(array.get(i));
            }
        }
        Collections.sort(Odd);
        Collections.sort(even);

        int oddnum = Odd.get(Odd.size() - 2);
        int evenum = even.get(even.size() - 2);

        return oddnum + evenum;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number : ");
        int question = sc.nextInt();
        int answer = (secondLar(question));
        System.out.println("The Answer is : "+answer);
        sc.close();
    }
}