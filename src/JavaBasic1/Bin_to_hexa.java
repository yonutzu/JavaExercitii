package JavaBasic1;

import java.util.Scanner;

/*
Write a Java program to convert a binary number to hexadecimal number
 */
public class Bin_to_hexa {
    public static void main(String[] args) {
        int[] hex = new int[1000];
        int i = 1, j = 0, rem, dec = 0, bin;
        Scanner in = new Scanner(System.in);
        System.out.println("Input binary number: ");

        bin = in.nextInt();
        while (bin > 0) {
            rem = bin % 2;
            dec = dec + rem * i;
            i = i * 2;
            bin = bin / 10;
        }
        i = 0;
        while (dec != 0) {
            hex[i] = dec % 16;
            dec = dec / 16;
            i++;
        }
        System.out.print("Hexadecimal number: ");
        for (j = i - 1; j >= 0; j--) {
            if (hex[j] > 9) {
                System.out.print((char) (hex[j] + 55));
            } else {
                System.out.print(hex[j]);
            }

        }
    }
}





