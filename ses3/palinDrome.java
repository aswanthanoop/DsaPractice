package ses3;

import java.util.Scanner;
class palinDrome{
    public static  boolean palindrome(String s){
        int n = s.length();
        
        int p1 = 0;
        int p2 = n-1;
        while(p1<p2){
            if(s.charAt(p1) != s.charAt(p2)){
                return false;
            
            }
           
            p1++;
            p2--;
            
            
        }
        return true;



    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String question = sc.next();
        boolean ans = palindrome(question);
        System.out.println(ans);
        sc.close();


    }
}