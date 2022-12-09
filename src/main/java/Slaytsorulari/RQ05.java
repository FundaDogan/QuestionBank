package Slaytsorulari;

import java.util.Scanner;

public class RQ05 {
    public static void main(String[] args) {

        //Ask user to enter a word which has 4 letters and output will be inverse of the word.
        //For example; if user enters “MARK” output will be “KRAM”

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word which has 4 letters ");
        String w= scan.next();

        System.out.println(w.charAt(3)+""+w.charAt(2)+""+w.charAt(1)+""+w.charAt(0));



    }
}
