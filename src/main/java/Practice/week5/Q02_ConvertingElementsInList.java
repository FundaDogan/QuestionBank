package Practice.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q02_ConvertingElementsInList {

    public static void main(String[] args) {
        /*
            If the list has 15 as element, change all 15s to 51
             Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
        */

        List<Integer> list = Arrays.asList(12,11,15,34,15,15,43,15);

        System.out.println(list);

        if (list.contains(15)){
            for (Integer w: list){
                if(w == 15){
                    list.set(list.indexOf(15), 51);
                }
            }

        }else {
            System.out.println("List does not contain the expected element");
        }
        System.out.println(list);//[12, 11, 51, 34, 51, 51, 51, 43]



         /*
             Find the sum of the least and the greatest price given in a String List.
                Example: List<String> myList= new List<String>{"$12.99", "$8.25", "$23.60", "$54.45"}; ==> 62.70
        */

            List<String> myList = Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        System.out.println(myList);

        List<Double> doubleList = new ArrayList<>();

        for (String w: myList){

           double price = Double.valueOf(w.replace("$","")) ;
           doubleList.add(price);

        }

        System.out.println(doubleList);

        Collections.sort(doubleList);
        System.out.println(doubleList);

        System.out.println(doubleList.get(0) + doubleList.get(doubleList.size()-1));

    }
}
