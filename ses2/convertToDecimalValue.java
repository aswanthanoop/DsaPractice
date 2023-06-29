package ses2;

import java.util.Scanner;

public class convertToDecimalValue {
    public static int convertBase17ToDecimal(String number) {
        int decimal = 0;
        int power = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            char c = number.charAt(i);
            int digitValue = Character.isDigit(c) ? Character.getNumericValue(c) : c - 'A' + 10;
            decimal += digitValue * Math.pow(17, power);
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int decimalValue = convertBase17ToDecimal(number);
        System.out.println(decimalValue);
    }
}
