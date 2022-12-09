package Practice.week4;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_Arrays {
    public static void main(String[] args) {

        //Example 3:Get string from user and type code to find the number of words in the String.
        //String str= {"Learn Java earn money"};

        Scanner input = new Scanner(System.in);
        System.out.println("please, enter a String");
        String str = input.nextLine();

        String arr[] = str.split(" ");
       int numOfWords =  arr.length;
        System.out.println(numOfWords);



        //Example 4: Count the number of words starts with "s" in the String
        int count =0;
       String brr[] = str.split(" ");  // yukardaki str yi kullandim

        for (String w: brr){

            if (w.startsWith("s")){
                count++;
            }
        }
        System.out.println(count);


    }
}
