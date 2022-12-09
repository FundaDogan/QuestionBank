package Slaytsorulari;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {

        /*Type java code by using if-else. Ask user to enter two integers
Write a program to print the minimum one on the console

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 2 integers");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();

        if (i1>i2) {
            System.out.println("min value is "+ i2);
        }else if (i1<i2){
            System.out.println("min value is "+ i1);
        }else{
            System.out.println("they are equal");
        }
        scan.close();


    }
}
