package Slaytsorulari;

import java.util.Scanner;

public class RQ08 {
    public static void main(String[] args) {

        /*Ask user ta enter his/her first name, last name and Social Security Number.
        Then type a program which makes
         a) initials of the first name and the last name in uppercase,
            other characters will be in lowercase.
        b) all characters except last 4 characters of the Social Security Number “ * ”.



         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your first name");
        String fn= scan.next();

        System.out.println("please enter your last name ");
        String ln = scan.next();

        System.out.println("please enter yous SSN");
        String ssn = scan.next();

       String fnInitial = fn.trim().substring(0,1).toUpperCase();

       String ln1 = ln.trim().toLowerCase();

        System.out.println(ln1);

        String ssn1 = ssn.substring(0,5).replaceAll("\\d","*");

        System.out.println(ssn1);



    }
}
