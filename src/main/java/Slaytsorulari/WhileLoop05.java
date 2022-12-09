package Slaytsorulari;

import java.util.Scanner;

public class WhileLoop05 {
    public static void main(String[] args) {
        /*
        Type java code by using while loop,
Write a program to count the factors of an integer which is entered by user.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("please, enter an integer");
        int num= scan.nextInt();

        int count=0;
        int i=1;
        while (i<=num){
            if(num%i==0){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.println(count);

       scan.close();



    }

}
