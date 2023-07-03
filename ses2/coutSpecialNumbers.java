package ses2;

public class coutSpecialNumbers {
    public static boolean isSpecial(int num) {
        while (num > 0) {
            int digit  = num % 10;
            if(digit != 1 && digit !=4 && digit != 9){
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static int countSpecial(int m, int n){
        int count  = 0;
        for(int i = m;i<=n;i++){
            if(isSpecial(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int m = 100;
        int  n = 200;
        System.out.println(countSpecial(m,n));
    }
    
}
