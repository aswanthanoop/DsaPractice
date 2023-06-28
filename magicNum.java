package ses2;

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
        int number = 1234;
        boolean ans = magic(number);
        if(ans == true) System.out.println(number+" is a Magic Number.");
        if(ans == false) System.out.println(number+" is not a Magic Number.");
        
    }
    
}

