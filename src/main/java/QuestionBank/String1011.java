package QuestionBank;

import java.util.Scanner;

public class String1011 {
    public static void main(String[] args) {

       /* 10) Type code to check if a String has just a single space character any position in the middle
        Example: For ‘Ali     Can’ your code should print false on the console
        For ‘ Ali Can ’ your code should print false on the console
        For ‘ Ali Can ’ your code should print false on the console
        For ‘Ali Can’ your code should print true on the console

        */

        String s = " Ali Can ";
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);
        boolean singleChar = sTrimmed.replaceAll("\\S","").length()==1;
        String result = (singleChar)? "there is a single space" :"there is no single space";
        System.out.println(result);

        /*  11) Type code to check if a String does not have any space character at the beginning and at the end?
                 Example: For ‘ Ali ’ your code should print false on the console
                 For ‘Ali’ your code should print true on the console

        */

            // Note: bir stringi trim yaptigin hali ile yapmadigin hali ayni ise basta ve sonda space yoktur.

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scan.nextLine();

        String strTrimmed = str.trim();
        boolean isCorrect = str.equals(strTrimmed);
        String res = isCorrect? "there is no space at the beginning and at the end": " there is space";
        System.out.println(res);


    }
}
