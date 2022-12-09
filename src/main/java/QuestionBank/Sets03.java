package QuestionBank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets03 {
    public static void main(String[] args) {
        // 3) Type code to print the common elements between a Set and a List

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(39);
        list.add(22);
        list.add(5);
        list.add(12);

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(10);
        set.add(12);
        set.add(20);
        set.add(5);
        set.add(10);


        set.retainAll(list);  // set ve listte bulunan ortak elemanlari koru, digerlerini sil
        System.out.println(set);

        //System.out.println(set.retainAll(list));  true basar.

        //list.retainAll(set);
        //System.out.println(list); boyle de olur aynisi.

        for (Integer w: list){

            if (set.contains(w)){
                System.out.print(w+" ");
            }
        }
    }
}
