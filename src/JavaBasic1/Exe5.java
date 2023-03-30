package JavaBasic1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exe5 {
    /*Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5   */

    public static void main(String[] args) {
//        int a = 25;
//        int b = 5;
//        System.out.println(a*b);

//          sau

        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = in.nextInt();

        System.out.println("Input second number: ");
        int b =in.nextInt();

        System.out.println(a + " x " + b + " = " + a*b);

    }
}
