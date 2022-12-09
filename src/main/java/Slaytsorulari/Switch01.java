package Slaytsorulari;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*If the user pressed 1, 2, 3 the program will print the number that is pressed;
         otherwise, program will print "Not allowed"
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = scan.nextInt();

        switch (num){
            case 1:
            case 2:
            case 3:
                System.out.println(num);
            break;
            default:
                System.out.println("not allowed");

                scan.close();








        }





    }
}
