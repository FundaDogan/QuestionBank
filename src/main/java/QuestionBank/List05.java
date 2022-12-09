package QuestionBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List05 {
    public static void main(String[] args) {

        // 5) If the list has 15 as element, change all 15s to 51
        //Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)

       /* List<Integer> list = Arrays.asList(12, 11, 15, 34, 43);

        for (Integer w: list){

            if (w==15){
                list.set(list.indexOf(15),51 );
            }
            continue;
        }
        System.out.println(list);

        */

        // 6) If a list has 15 or 13, remove them.
        //Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)



        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(31);
        list1.add(15);
        list1.add(13);
        list1.add(54);
        System.out.println(list1);

        Iterator<Integer> m = list1.listIterator();

        while(m.hasNext()){
         Integer element = m.next();
         m.remove();
        }
        System.out.println(list1);


//        for (int i =0; i<list1.size(); i++){
//            if (list1.get(i)==15){
//                list1.remove(Integer.valueOf(15));
//            }
//            if (list1.get(i)==13){
//                    list1.remove(list1.get(i));
//
//                }
//            }
//        System.out.println(list1);
//
//

        }







    }

