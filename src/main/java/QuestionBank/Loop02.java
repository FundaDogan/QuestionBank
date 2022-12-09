package QuestionBank;

public class Loop02 {
    public static void main(String[] args) {

        // 2) Type code to print repeated characters in a String. For example; accessories ⇒ ces

        String s = "accessories";

        String empty = "";
        for (int i=0; i<s.length();i++){

            String ch = s. substring(i,i+1);

            if (s.indexOf(ch)!= s.lastIndexOf(ch)){
                if (!empty.contains(ch)){

                    empty=empty+ch;
                }


            }

        }
        System.out.println(empty);

    }

}
