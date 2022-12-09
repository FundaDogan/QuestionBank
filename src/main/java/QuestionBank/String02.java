package QuestionBank;

public class String02 {
    public static void main(String[] args) {

        /*2) Create 3 String variables for people's names. Print the sum of the number of characters in
            all the 3 names except space characters.
            Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console

         */

        String s1 = "Ali Can";
        String s2 = "Merve Star";
        String s3 = "Mark Tom";

       int ls1 = s1.replaceAll("\\s","").length();
       int ls2 = s2.replaceAll("\\s","").length();
       int ls3 = s3.replaceAll("\\s","").length();

        System.out.println(ls1+ls2+ls3);





    }
}
