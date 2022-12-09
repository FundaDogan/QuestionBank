package QuestionBank;

public class String0304 {

    public static void main(String[] args) {

        /*3) Create a String variable, print the total number of alphabetical and numeric characters in
            the String on the console.
            Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console

         */
        String str = "Miami 33018!!!";
        int i = str.replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println(i);


        /* 4) Create a String variable, print the number of non-digit characters in the String on the
              console.
              Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.

         */

        String s = "1a3Bcf4!...";


        int l1 = s.replaceAll("\\d","").length();
        System.out.println(l1);





    }
}
