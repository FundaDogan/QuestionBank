package QuestionBank;

import java.util.*;

public class Sets02 {
    public static void main(String[] args) {
        // 2) Type code to print different characters used in a String
        //Example: ‘Mississippi’ ==> Misp

        String s = "Mississippi";

        //1. Way
        Set<Character> letters = new HashSet<>();

        for (int i=0; i<s.length();i++){

            if (!letters.contains(s.charAt(i))){
                letters.add(s.charAt(i));
            }
        }
        System.out.println(letters);

        //2.way
        String arr[] = s.split("");
        List<String> sList = Arrays.asList(arr);
        Set<String> sSet = new HashSet<>(sList);
        System.out.println(sSet);

    }
}
