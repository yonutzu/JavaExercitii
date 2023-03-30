package JavaBasic1;

import java.util.Scanner;

/*
 Write a Java program to convert a decimal number to octal number
 */
public class Dec_to_octal {
    public static void main(String[] args) {
        int dec_num, rem;
        String octadec = "";

        char octa []  = {'0','1','2','3','4','5','6','7'};
        Scanner scanner = new Scanner(System.in);
        dec_num =  scanner.nextInt();


        while(dec_num>0){
           rem = dec_num%8;
           octadec = octa[rem] + octadec;
           dec_num = dec_num/8;

        }
        System.out.println("Octal number is " + octadec );
    }
}
