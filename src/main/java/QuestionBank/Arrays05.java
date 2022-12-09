package QuestionBank;

import java.util.Scanner;

public class Arrays05 {

    public static void main(String[] args) {

        // 5) Find the total number of characters used in String array elements
        //Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26

        String arr[] ={"Kemal","Jonathan", "Mark", "Angie", "Veli"};

        int numOfChars =0;

        for (String w:arr){

            numOfChars=numOfChars+w.length();

        }
        System.out.println(numOfChars);

        System.out.println();

        // 6) Count how many words start with 'a' or 'A' in a given String

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter a sentence");
        String sentence = input.nextLine();

        int counter=0;

        String brr[] = sentence.split(" ");

        for (String w: brr){

            char ch = w.charAt(0);

            if (ch=='a' || ch=='A'){
                counter++;
            }
        }
        System.out.println(counter);


    }
}
