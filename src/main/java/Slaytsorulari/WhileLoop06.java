package Slaytsorulari;

import java.util.Scanner;

public class WhileLoop06 {
    public static void main(String[] args) {

        /*Type java code by using while loop,
        Write a program that prompts the user to input an integer.
        It should then find sum of the digits of that number.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("please, type an integer");
        int i = input.nextInt();

        i= Math.abs(i);

        int sum =0;

        while (i>0){
            sum = sum +(i%10);
            i/=10;
        }
        System.out.println(sum);

    }
}