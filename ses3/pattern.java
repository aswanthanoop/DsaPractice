package ses3;

import java .util.*;
public class pattern {
    public static Character[][] patter(String s) {
        ArrayList<Character> string = new ArrayList<>();
        int a = s.length();

        for (int i = 0; i < a; i++) {
            string.add(s.charAt(i));
        }

        Character[][] result = new Character[a+1][a];
        for (int i = 0; i < a; i++) {
            result[i][i] = string.get(i);
        }

        for (int j = 0; j < a; j++) {
            result[(a + 1) - j - 1][j] = string.get(j);
        }
        
        

        return result;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String question = sc.next();
        Character[][] answer = patter(question);

        System.out.println("Result:");
        for (Character[] row : answer) {
            for (Character ch : row) {
                
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}