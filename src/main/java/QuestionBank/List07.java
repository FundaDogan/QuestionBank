package QuestionBank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List07 {
    public static void main(String[] args) {
        //7) Find the closest 2 integers in an Integer List
        //Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13

        List<Integer> list = Arrays.asList(12, 31, 15, 13, 54);

        Collections.sort(list);
        System.out.println(list); //[12, 13, 15, 31, 54]

        int minDifference = list.get(1)-list.get(0);

        for (int i =1; i<list.size();i++){

            minDifference = Math.min(minDifference,(list.get(i)-list.get(i-1)));

            if (list.get(i)-list.get(i-1)== minDifference){
                System.out.println(list.get(i-1)+" "+list.get(i)+ " are closest elements");
            }
        }

        // 8) Increase the value of every element except 7 and 10 by 2 in a List
        //Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)

        List<Integer> a = Arrays.asList(12, 31, 7, 13, 10);

       for (Integer w:a){

           if (w==7 || w==10){
               continue;
           }else{
               a.set(a.indexOf(w),w+2);
           }
       }
        System.out.println(a);











    }
}
