package Slaytsorulari;

import java.util.Scanner;

public class ReviewQuestions02 {
    public static void main(String[] args) {

        /*Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”

        if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
        “This name contains neither ‘a’ nor ‘z’.”

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your kid's name");
        String str= scan.next();

        if (str.indexOf('a')!=-1){
            System.out.println("This name contains ‘a’");
        }else if (str.indexOf('z')!=1){
            System.out.println("This name contains 'z'");
        }else {
            System.out.println("This name contains neither ‘a’ nor ‘z’.");
        }
        scan.close();

    }
}
