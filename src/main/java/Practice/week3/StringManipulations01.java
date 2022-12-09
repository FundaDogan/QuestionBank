package Practice.week3;

public class StringManipulations01 {

    public static void main(String[] args) {

        // type code to reverse a string.

        String s = "Funda";

        String reversed = "";

        for (int i= s.length()-1;i>-1;i--){

            reversed = reversed+s.charAt(i);

        }
        System.out.println(reversed);

    }
}
