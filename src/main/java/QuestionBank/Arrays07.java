package QuestionBank;

import java.util.Scanner;

public class Arrays07 {
    public static void main(String[] args) {

        // 7) Find the number of vowels in a String

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter a sentence");
        String sentence = input.nextLine();

        int counter= 0;
        String s=sentence.replaceAll("[^aeiou]","");
        System.out.println(s);

        String arr[] = s.split("");

       int numOfChars= arr.length;
        System.out.println(numOfChars);








    }
}
