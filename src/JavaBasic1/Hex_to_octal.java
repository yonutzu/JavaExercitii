package JavaBasic1;

import java.util.Scanner;

public class Hex_to_octal {
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
        String hexDecNum;
        int decNum, i=1, j;
        int octalNum[]= new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a hexadecimal number:  ");
        hexDecNum = scanner.next();

        /*  convert hexadcimal number to decimal number  */

        decNum = hex_to_dec(hexDecNum);

        /* convert decimal to octal  */

        while(decNum !=0){
            octalNum[i++] = decNum%8;
            decNum =decNum/8;
        }

        System.out.print("Equivalent of octal number is :");
        for( j = i-1; j>0; j--){
            System.out.print(octalNum[j]);
        }
        System.out.print("\n");

    }
}
