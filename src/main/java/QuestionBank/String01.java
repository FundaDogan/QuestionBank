package QuestionBank;

import java.util.Locale;
import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {

        // 1) Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters
        //are in lower cases on the console.

        String s = "bURDUR";
      String s1= s.substring(0,1).toUpperCase();
      String s2 =s.substring(1).toLowerCase();
        System.out.println(s1+s2);

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a one word city name");
        String str = input.next();

       String str1 = str.substring(0,1).toUpperCase();
       String str2 = str.substring(1).toLowerCase();
        System.out.println(str1+str2);

        // hocanin yoluna bak farkli

       input.close();

        }
    }

