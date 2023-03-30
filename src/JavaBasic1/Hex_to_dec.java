package JavaBasic1;

import java.util.Scanner;

/*
Write a Java program to convert a hexadecimal to a decimal number.
 */
public class Hex_to_dec {
    public static int hex_to_dec (String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
char c = s.charAt(i);
int d = digits.indexOf(c);
val = 16*val+d;
        }
        return val;
    }
    public static void main(String[] args) {
        String hexaNum;
        int decnum;
        Scanner in = new Scanner(System.in);
        System.out.println("Input hexadecimal number: ");
        hexaNum = in.next();
decnum = hex_to_dec(hexaNum);
        System.out.println("Equivalent decimal number is " + decnum + "\n");
    }
}
