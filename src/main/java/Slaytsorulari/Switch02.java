package Slaytsorulari;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        /*Write a Java program user will choose answer among A, B, C, or D.
            If the answer is true, output will be “True.”
            If the answer is false, output will be“ False”.
            Correct answer is ‘C’ for the multiple option question.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("please choose answer among A, B, C, or D ");
        char ch = scan.next().charAt(0);

        switch (ch){
            case 'C':
                System.out.println("true");
                break;
            case 'A':
            case 'B':
            case 'D':
                System.out.println("false");
                break;
            default:
                System.out.println("please enter a valid char");

                scan.close();











        }






    }
}
