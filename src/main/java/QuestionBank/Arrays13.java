package QuestionBank;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays13 {

    public static void main(String[] args) {

        /*  13) Ask the user to enter 2 Strings. If the characters and the numbers of characters of the
            Strings are the same then print "Anagram" on the console. Otherwise, print "Not Anagram"
            on the console. Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter two strings");
        String s1= input.nextLine();
        String s2 =input.nextLine();

        String a1[] = s1.toLowerCase().split("");
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        String a2[] = s2.toLowerCase().split("");
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));

        if (Arrays.equals(a1,a2)){
            System.out.println("Strings are anagrams");
        }else {
            System.out.println("Strings are not anagrams");
        }






    }
}
