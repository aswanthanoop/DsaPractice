package ses2;
import java.util.Scanner;

public class magicNum {
    public static boolean magic(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        int finSum = 0;
        while(sum>0){
            finSum+= sum%10;
            sum/=10;
        }
        if (finSum==1) return true;
        return false;
        

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = sc.nextInt();
        
        boolean ans = magic(a);
        
        if(ans == true) System.out.println(a+" is a Magic Number.");
        if(ans == false) System.out.println(a+" is not a Magic Number.");
        sc.close();
        
    }
    
}

