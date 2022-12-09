package Practice.week2;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

       // Ask user to enter a character, if it is vowel print "Vowel" and if it is not vowel print "Not vowel".

        Scanner input = new Scanner(System.in);
        System.out.println("pls, enter a character");
        char ch = input.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            case'b':
            case'c':
            case'd':
            case'f':
            case'g':
            case'h':
            case'j':
            case'k':
            case'l':
            case'm':
            case'n':
            case'p':
            case'r':
            case's':
            case't':
            case'v':
            case'y':
            case'z':
                System.out.println("not vowel");
                break;
            default:
                System.out.println("please enter an alphabetical character");

        }
            input.close();






    }
}
