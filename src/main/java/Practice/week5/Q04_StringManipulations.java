package Practice.week5;

public class Q04_StringManipulations {
    public static void main(String[] args) {

           /*
Type code to check if a String has an Uppercase initial and dot at the end.

For Ex: for "Ali", your code should print false on the console
        for  "ali." your code should print false on the console
        for "Ali." your code should print true on the console
        for "Ali. " your code should print false on the console
        for "ALI." your code should print true on the console
    */

        String name = "Tom Hanks";

        char firstChar = name.charAt(0);
        boolean firstRule = firstChar>='A' && firstChar<='Z';
        boolean secondRule = name.endsWith(".");

        if (firstRule && secondRule){
            System.out.println("true");
        }else {
            System.out.println("false");
        }



    }
}
