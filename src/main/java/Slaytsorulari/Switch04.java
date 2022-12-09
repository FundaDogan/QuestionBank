package Slaytsorulari;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {

        /*Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
            Then type a program by using “switch statement” to print “United” for ‘U’
            ”States” for ’S’, and “America” for ‘A’
           */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter one of the ‘U’, ’S’, and ‘A’");
        char ch = scan.next().charAt(0);

        switch (ch){
            case 'U':
                System.out.println("united");
                break;
            case 'S':
                System.out.println("states");
                break;
            case 'A':
                System.out.println("america");
                break;
            default:
                System.out.println("invalid");

            scan.close();



        }






    }
}
