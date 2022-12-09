package QuestionBank;

public class Loop15 {

    public static void main(String[] args) {

        // 15) Type code to print characters from 'C' to 'A' on the console by using do-while loop

        char ch = 'C';

        while (ch>='A'){

            System.out.print(ch+" ");
            ch--;
        }

        System.out.println();
        
       // 16) Type all characters before the first occurrence of 'm' in a String

        String s = "Evim";

        String s1 ="";

        for (int i =0; i<s.length(); i++){

            String sch = s.substring(i,i+1);

            if (sch.equals("m")){
                break;
            }
            s1= s1+ sch;
        }
        System.out.println(s1);



    }
}
