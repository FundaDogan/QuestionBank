package QuestionBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List04 {
    public static void main(String[] args) {

        /* 4) Check if elements are in descending order in a list
        Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
        (Yellow, Red, Green, Blue) ==> Output: It is in descending order
         */

        List<String> list1 = Arrays.asList("Yellow","Green", "Red", "Blue");

        List<String > list2 =Arrays.asList("Yellow","Green", "Red", "Blue");

        Collections.sort(list2);
        System.out.println(list2); // [Blue, Green, Red, Yellow]  ascending order

        List<String> bos = new ArrayList<>();

        for (int i= list2.size()-1; i>-1; i--){
            bos.add(list2.get(i));
        }
        System.out.println(bos); // [Yellow, Red, Green, Blue]

        if (list1.equals(bos)){
            System.out.println(" It is in descending order");
        }else {
            System.out.println(" It is not in descending order");
        }




    }
}
