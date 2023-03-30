package JavaBasic1;

import java.util.Scanner;

/*
Write a Java program to convert a binary number to decimal number
 */
public class Bin_to_dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binaryNumber, decimalnumber = 0, j = 1, rem;
        System.out.println("Input a binary number: ");

        binaryNumber = sc.nextLong();
        while (binaryNumber != 0) {
    rem = binaryNumber %10;
    decimalnumber = decimalnumber + rem *j;
    j= j*2;
    binaryNumber = binaryNumber/10;
        }
        System.out.println("Decimal number: " + decimalnumber);
    }
}
