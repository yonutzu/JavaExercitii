package JavaBasic1;

import java.util.Scanner;

public class Hex_to_bin {
    public static int hex_to_dec(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static void main(String[] args) {
        String hexDecNum;
        int decNum, i = 1, j;
        int binNum[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        hexDecNum = scanner.next();

        /* convert hexadecimal to decimal */

        decNum = hex_to_dec(hexDecNum);

        /*convert decimal to binary*/

        while (decNum != 0) {
            binNum[i++] = decNum % 2;
            decNum = decNum / 2;
        }
        System.out.print("Equivalent binary number is ");
        for(j=i-1; j>0;j--){
            System.out.print(binNum[j]);

        }
        System.out.print("\n");
    }
}
