package QuestionBank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set0405 {
    public static void main(String[] args) {
        // 4) Type code to print the different elements in a Set from a List

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

       set.removeAll(list);
        System.out.println(set);

        // 5) Type code to check if a List has repeated elements or not

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(10);
        list1.add(22);
        list1.add(22);
        list1.add(5);

        Set<Integer> set1 = new HashSet<>(list1);
        if (list1.size()> set.size()){
            System.out.println("list1 has repeated elements");
        }else{
            System.out.println("list1 has not repeated elements");
        }

    }

}
