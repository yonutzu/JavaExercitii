package JavaBasic1;

import java.util.Scanner;

/*
Write a Java program to convert a binary number to a Octal number
 */
public class Bin_to_octal {
    public static void main(String[] args) {
        int binum, binum1, rem, decnum = 0, quot, i = 1, j;
        int octum[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input binary number:");
        binum = scanner.nextInt();
        binum1 = binum;

        while (binum > 0) {
            rem = binum % 10;
            decnum = decnum + rem * i;
            i = i * 2;
            binum = binum / 10;
        }
        i = 1;
        quot = decnum;

        while (quot > 0) {
            octum[i++] = quot % 8;
            quot = quot / 8;
        }
        System.out.print("Equivalent Octal Value of " + binum1 + " is ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(octum[j]);
        }
        System.out.print("\n");
    }
}
