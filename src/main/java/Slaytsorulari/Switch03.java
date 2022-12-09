package Slaytsorulari;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        /*Type java code by using switch statement.
                A school has following rules for grading system:
        1. For 50 - C 2. For 80 - B. 4. For 100 - A
        Ask user to enter marks and print the corresponding grade.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your score");
        int score = scan.nextInt();

        switch (score){
            case 50:
                System.out.println("C");
                break;
            case 80:
                System.out.println("B");
                break;
            case 100:
                System.out.println("A");
                break;
            default:
                System.out.println("invalid");
               scan.close();






        }







    }
}
