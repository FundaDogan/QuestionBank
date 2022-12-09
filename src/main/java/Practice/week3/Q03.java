package Practice.week3;

public class Q03 {
    public static void main(String[] args) {

        //Type code to check if a given integer is palindrome or not

        //Palindrome: 121 <==> 121       123321 <==> 123321      nalan <==>nalan

        int i = 121;
        String s= String.valueOf(i); // "121"

        String reversed = "";

        for (int j=s.length()-1; j>-1; j--){

           reversed = reversed+ s.charAt(j);
        }
        System.out.println(reversed);

        if (s.equals(reversed)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
