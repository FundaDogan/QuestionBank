package QuestionBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List10 {
    public static void main(String[] args) {

        //10) Find the sum of the least and the greatest price given in a String list
        //Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String> myList = Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        List<Double> list = new ArrayList<>();

        for (String w:myList){

            double d = Double.valueOf(w.replace("$",""));
            list.add(d);
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        double greatestPrice= list.get(list.size()-1);
        double lowestPrice = list.get(0);

        System.out.println(greatestPrice+lowestPrice);
    }
}
