package ses2;

public class contigousFragments {
    public static int countContigious(int num){
        String numStr = String.valueOf(num);
        int count = 0;

        for(int i = 0;i<numStr.length();i++){
            int currentNum = 0;
            for(int j = i;j<numStr.length();j++){
                currentNum = currentNum*10 + (numStr.charAt(j) - '0');
                if(currentNum % 11 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 1215598;
        int ans = countContigious(num);
        System.out.println(ans);
        
        
    }
    
}

