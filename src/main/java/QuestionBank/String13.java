package QuestionBank;

public class String13 {

    public static void main(String[] args) {

        /*13) Type code to check if a password is valid or not for the following conditions;
                Password must have at least 8 characters different from space character
                Password must have at least 1 symbol
                Example: For ‘A2b!’ your code should print false on the console
                For ‘A2b3cdef’ your code should print false on the console
                For ‘!1a23b4’ your code should print false on the console
                For ‘!1a23b4?es’ your code should print true on the console
                For ‘! a b 3 k’ your code should print false on the console

         */

        String pwd = "! a b 3 k";
        boolean b1 = pwd.replaceAll("\\s","").length()>=8;
        boolean b2 = pwd.replaceAll("[a-zA-Z0-9 ]","").length()>=1;
        String result = (b1 && b2)? "pwd is valid": "pwd is unvalid";
        System.out.println(result);


        /*
        14) Type code to check if a String has a specific single character or not, in three different ways
         */

        String s = "Funda";
        boolean b3 = s.contains("n");
        System.out.println("Does the character exist? "+ b3);


        /* 15) String shirtPrice = ‘$12.99’;
                String bookPrice = ‘$35.99’;
                Type code to find the sum of the shirt and book prices.

         */

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String shirt = shirtPrice.replace("$","");
        String book = bookPrice.replace("$","");

        double shirtInDouble = Double.valueOf(shirt);
        double bookInDouble = Double.valueOf(book);

        System.out.println("Total price is: "+ (shirtInDouble+bookInDouble));





    }
}
