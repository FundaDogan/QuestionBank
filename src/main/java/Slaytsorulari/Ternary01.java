package Slaytsorulari;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        /* Type java code by using ternary and if-else,
        ask user to enter an integer,
        if the integer is even, the output will be “The integer is even”.
        If the integer is odd, the output will be “The integer is odd”
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter an integer");
        int i = scan.nextInt();

        String result = i%2==0 ? "The integer is even" : "The integer is odd";
        System.out.println(result);





    }
}
