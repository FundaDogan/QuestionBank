package QuestionBank;

public class Loop01 {
    public static void main(String[] args) {

        //  2) Type code to print repeated characters in a String. For example; accessories ⇒ ces

        //  repeated chars means non unique chars

        String s = "accessories";
        String empty = "";

        int i = 0;
        while (i < s.length()) {

            String ch = s.substring(i, i + 1);

            if (s.indexOf(ch) != s.lastIndexOf(ch)) {

                if (!empty.contains(ch)) {
                    empty = empty + ch;
                }

            }
            i++;

        }
        System.out.print(empty);

        System.out.println();

        // write unique chars in acar.

        String s1 = "acar";

        int i1 = 0;
        while (i1<s1.length()){

            String ch1 = s1.substring(i1,i1+1);
            if (s1.indexOf(ch1)==s1.lastIndexOf(ch1)) {

                System.out.print(ch1);
            }

            i1++;
        }






    }
}
