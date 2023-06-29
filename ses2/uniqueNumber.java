package ses2;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class uniqueNumber {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; 
            }
            set.add(num);
        }
        return false; 
    }

    public static boolean unique(int numss){
        int[] digits = String.valueOf(numss).chars().map(Character::getNumericValue).toArray(); 
        boolean b = containsDuplicate(digits);
        return b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("The given number is " + (unique(a) ? "not " : "") + "unique");
        sc.close();
    }
}

    

