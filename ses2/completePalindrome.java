package ses2;

import java.util.ArrayList;


public class completePalindrome {
    public static ArrayList<Character> palindrome(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(i, s.charAt(i));
        }
        int left = 0;
        int right = list.size() - 1;
        boolean flag = true;

        while (left < right) {
            if (list.get(left) != list.get(right)) {
                flag = false;
                break;

            } else {
                flag = true;
                left++;
                right--;
            }

        }
        if (flag == false) {
            int j = 0;
            for (int i = s.length() - 2; i >= 0; i--) {
                list.add(s.length() + j, list.get(i));
                j++;
            }
        } else {
            return list;

            

        }
        return list;
    }

    public static void main(String[] args) {
        String s = "abcbab";
        ArrayList<Character> ans = palindrome(s);
        System.out.println(ans);

    }

}

