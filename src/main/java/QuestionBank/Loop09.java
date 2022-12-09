package QuestionBank;

public class Loop09 {

    public static void main(String[] args) {

        /*   9) Type code to print all lowercase characters in a String with an asterix.
                For example; 'Ali Can?' ==> l*i*a*n*
        */
        String s = "Ali Can?";

        for (int i=0; i<s.length(); i++){

            char ch = s.charAt(i);
            if (ch>='a' && ch<='z'){

                System.out.print(ch+"*");
            }

        }

        System.out.println();

        /*  10) Type code to print digits just in the decimal part of the given decimal number with an
                asterix. For example; 75.4238 Ş *4*2*3*8
        */

        double d = 75.4238;
        String str = String.valueOf(d);

        String arr[] = str.split("\\.");
        String s1 = arr[1];

        for (int j =0; j<s1.length(); j++){

            char ch1 = s1.charAt(j);

            System.out.print("*"+ch1);
        }

    }
}
