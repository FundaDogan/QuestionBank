package Slaytsorulari;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        /*Type java code by using nested if() statement.
Ask user to enter a password
If the initial of the password is uppercase then check if it is ‘A’ or not.
If it is ‘A’ the output will be “Valid Password”
otherwise the output will be “Invalid Password”
For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid
If the initial of the password is lowercase then check if it is ‘z’ or not.
If it is ‘z’ the output will be “Valid Password”
otherwise the output will be “Invalid Password”
For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter password");
        String psw= scan.nextLine();

        if (psw.charAt(0)>='A' && psw.charAt(0)<='Z'){
            if (psw.charAt(0)=='A'){
                System.out.println("valid");
            }else {
                System.out.println("invalid");
            }

        }else if (psw.charAt(0)>='a' && psw.charAt(0)<='z'){
            if (psw.charAt(0)=='z') {
                System.out.println("valid");
            }else {
                System.out.println("invalid");
            }

        }else {
            System.out.println("invalid");
        }

        scan.close();

    }
}
