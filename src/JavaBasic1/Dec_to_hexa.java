package JavaBasic1;

import java.util.Scanner;

/*
Write a Java program to convert a decimal number to hexadecimal number.
 */
public class Dec_to_hexa {
    public static void main(String[] args) {
        {
            int dec_num, rem;
            String hexdec_num = "";

            /* hexadecimal number digits */

            char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

            Scanner in = new Scanner(System.in);

            System.out.println("Input a decimal number: ");
            dec_num = in.nextInt();

            while (dec_num > 0) {
                rem = dec_num % 16;
                hexdec_num = hex[rem] + hexdec_num;
                dec_num = dec_num / 16;
            }
            System.out.print("Hexadecimal number is : " + hexdec_num + "\n");
        }

    }
}
