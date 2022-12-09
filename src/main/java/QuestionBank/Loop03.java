package QuestionBank;

public class Loop03 {
    public static void main(String[] args) {

        //3) Type code to check whether a String is palindrome or not. If a String is the same with its
        //reverse then it is called palindrome. For example; “anna”, “123321” are palindromes

        String s ="anna";
        String reversed = "";

        for (int i=s.length()-1; i>-1; i--){

            String ch = s.substring(i,i+1);
            reversed=reversed+ch;

        }
        if (s.equals(reversed)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("not palidrome");
        }

    }
}
