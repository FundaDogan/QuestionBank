package QuestionBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List11 {
    public static void main(String[] args) {

        // 11) Check if all elements are unique in an integer List by using loops

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<String> list1 = new ArrayList<>();

        int counter =0;
        for (Integer w:list){

            String w1 = String.valueOf(w);
            list1.add(w1);

        }
            for (int i=0; i<list1.size(); i++){

                if (list1.lastIndexOf(list1.get(i))== list1.indexOf(list1.get(i))){
                   counter++;
                }
            }

            if (counter==list1.size()){
                System.out.println("every element is unique");
            }else{
                System.out.println("At least one element is repeated");
            }





    }
}
