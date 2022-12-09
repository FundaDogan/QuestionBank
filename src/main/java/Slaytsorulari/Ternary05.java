package Slaytsorulari;

import java.util.Scanner;

public class Ternary05 {
    public static void main(String[] args) {

        //Ask user to enter a String. If the String has 2 characters, output will be
        //“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a String");
        String s= scan.next();

        String result = s.length()==2 ? "It is valid for state abbreviations" : "It is not valid for state abbreviations";
        System.out.println(result);

        scan.close();

    }
}
