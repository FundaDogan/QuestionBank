package QuestionBank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets01 {
    public static void main(String[] args) {

        // 1) Type the code that shows how many different elements there are in a list.
        //Example: {10, 31, 15, 7, 15, 7, 7} ==> 4

        List<Integer> m = new ArrayList<>();
        m.add(10);
        m.add(31);
        m.add(15);
        m.add(7);
        m.add(15);
        m.add(7);
        m.add(7);

        // 1. way
        List<Integer> n = new ArrayList<>();

        for (Integer w: m){
            if (!n.contains(w)){
                n.add(w);
            }
        }
        System.out.println(n.size());

        //2.way
        Set<Integer> nSet = new HashSet<>(n);
        System.out.println(nSet.size());
    }
}
