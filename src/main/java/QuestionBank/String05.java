package QuestionBank;

public class String05 {

    public static void main(String[] args) {

        /* 5) Create a String variable and print just the last non-space character on the console for any String.
            Example: For ‘Ali Can’ you should print n
            For ‘Miami ’ you should print i etc.

         */

        String str = "Ali Can";
        char ch = str.trim().charAt(str.length()-1);
        System.out.println(ch);


        // 6) Create a String variable and find the sum of the ASCII values of the first and the last   characters of the String.

        String s= "Funda";
        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);

        System.out.println(first+last);


        // 7) Create a String variable and print all characters except the first character on the console.
        //Example:If the String is ‘Java’ you should print ‘ava’ on the console.

        String s1 = "Java";
        String allCharsExceptFirstChar = s1.substring(1);
        System.out.println(allCharsExceptFirstChar);


        /* 8) Create a String variable and print all characters except the last character on the console in uppercases.
              Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
        */

        int indexOfLastChar = s1.length()-1;
        String allCharsExceptLastChar = s1.substring(0,indexOfLastChar).toUpperCase();
        System.out.println(allCharsExceptLastChar);

        /* 9) Create a String variable and print all characters except the first character and the last
                character on the console in uppercases.
                Example:If the String is ‘Java’ you should print ‘AV’ on the console.

         */

        String s11 = s1.substring(1,indexOfLastChar).toUpperCase();
        System.out.println(s11);










    }
}
