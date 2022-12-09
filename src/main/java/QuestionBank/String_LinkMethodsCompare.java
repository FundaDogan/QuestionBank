package QuestionBank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_LinkMethodsCompare {

    public static void main(String[] args) {

        String s= "Funda";
        System.out.println(s.indexOf("Funda"));
        System.out.println(s.indexOf("a",2));

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");

        System.out.println(list.indexOf("a"));

        s.charAt(2);
        list.contains("a");
        System.out.println(s.concat("g"));




    }
}
