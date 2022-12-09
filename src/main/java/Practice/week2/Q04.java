package Practice.week2;

public class Q04 {
    public static void main(String[] args) {

        // Type a code to find the number of punctuation marks used in a String.

        String str = "Wow!... Ali is 13 years old, and he is a university student.";

        int totalNumOfChar = str.length();
        System.out.println(totalNumOfChar);

        String strWithoutPunct = str.replaceAll("\\p{Punct}","");

        // regular expression for All Punctuations can be typed "\\p{Punct}"
        // By replaceAll() punctation will be replaced with nothing.
        // So, we can find the number of characters in the statement.
        //  " \\p " means all

        System.out.println(strWithoutPunct);
        System.out.println(totalNumOfChar-strWithoutPunct.length());



        System.out.println(str.length() - str.replaceAll("\\p{Punct}","").length());


        // easier way

        System.out.println(str.replaceAll("\\P{Punct}", "").length());





    }
}
