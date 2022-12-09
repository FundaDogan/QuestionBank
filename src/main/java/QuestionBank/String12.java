package QuestionBank;

import java.util.Scanner;

public class String12 {

    public static void main(String[] args) {

        /* 12) Type code to check if a String has an uppercase initial and dot at the end.
        Example: For ‘Ali’ your code should print false on the console
        For ‘ali.’ your code should print false on the console
        For ‘ Ali. ’ your code should print false on the console
        For ‘Ali.’ your code should print true on the console
        For ‘ALI.’ your code should print true on the console

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scan.nextLine();

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);

        boolean firstRule = firstChar>='A' && firstChar<='Z';
        boolean secondRule = lastChar=='.';

        if (firstRule && secondRule){
            System.out.println("true");
        }else{
            System.out.println("false");
        }









    }
}
