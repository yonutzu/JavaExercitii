package JavaBasic1;

import java.util.Scanner;

public class Dec_to_bin {
    /*Write a Java program to convert a decimal number to binary number. Go to the editor
    Input Data:
    Input a Decimal Number : 5*/

    public static void main(String[] args) {
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];
        Scanner in = new Scanner(System.in);
        System.out.println("Input a decimal number: ");

        dec_num = in.nextInt();
        quot = dec_num;

        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }
        System.out.println("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.println("\n");
    }
}
