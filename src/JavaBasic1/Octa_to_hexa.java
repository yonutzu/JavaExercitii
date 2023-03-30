package JavaBasic1;

import java.util.Scanner;

/*
Write a Java program to convert a octal number to a hexadecimal number
 */
public class Octa_to_hexa {
    public static void main(String[] args) {
      String octalNum, hexNum;
      int decNum;
        Scanner in = new Scanner(System.in);
        octalNum = in.next();
        decNum = Integer.parseInt(octalNum, 8);
        hexNum = Integer.toHexString(decNum);
        System.out.println("Equivalent of octal number is " + hexNum + "\n");
    }
}
