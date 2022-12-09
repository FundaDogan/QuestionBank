package QuestionBank;

import java.util.Scanner;

public class loop11 {

    public static void main(String[] args) {

        //11) Type code to reverse a String. Example; Mark ==> kraM

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter a string");
        String s = input.nextLine();

        String reversedS = "";

        for (int i =s.length()-1; i>-1; i--){

            String ch = s.substring(i,i+1);
            reversedS= reversedS+ ch;

        }
        System.out.println(reversedS);

    }
}
