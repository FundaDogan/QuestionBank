package Slaytsorulari;

import java.util.Scanner;

public class WhileLoop03 {
    public static void main(String[] args) {
        /* 3)
         Type java code by using while loop,
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("please, enter a positive integer");
        int num= scan.nextInt();

        int i= 0;
        while (i<=10){
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }
        scan.close();





    }
}
