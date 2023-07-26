package ses4;
import java.util.*;

public class wordAverage{
    

    public static float average(String str){
        ArrayList<Character> qn = new ArrayList<>();
        ArrayList<Integer> ascii = new ArrayList<>();
        for(int i = 0;i<str.length();i++){
            qn.add(str.charAt(i));
        }
        for(int i = 0;i<qn.size();i++){
            int asc = (int) qn.get(i);
            ascii.add(asc);
        }
        float sum = 0;
        for(int i = 0;i<ascii.size();i++){
            sum+=ascii.get(i);
        }
        float avg = sum/ascii.size();
        return avg;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String a = sc.next();
        System.out.print("The word Average is "+average(a));
    }
}
    

