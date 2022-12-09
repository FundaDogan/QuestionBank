package QuestionBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List09 {

    public static void main(String[] args) {

        //9) Find the sum of all prices given in a String list
       // Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String> myList = Arrays.asList("$12.99", "$23.60", "$54.45");

        double sum =0;
        for (String w: myList){

            Double d= Double.valueOf(w.replace("$",""));
            sum = sum+d;
        }
        System.out.println(sum);






    }
}
