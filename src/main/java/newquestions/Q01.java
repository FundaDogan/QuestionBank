package newquestions;

public class Q01 {
    //Create a method which gives you a random alphabetical character in myClass Class then
//        print the following by using the method.
//        Print "First Character" for 'A' and 'a'
//        Print "Second Character" for 'B' and 'b'
//        Print "Third Character" for 'C' and 'c'
//        Print "Forth Character" for 'D' and 'd'
//        Print "Other Characters" for all others

    public static void main(String[] args) {
       print('a');
        print('C');
       print('e');

    }

    public static void print(char ch){

        switch (ch){
            case 'A':
            case 'a':
                System.out.println("First Character");
                break;
            case 'B':
            case 'b':
                System.out.println("Second Character");
                break;
            case 'C':
            case 'c':
                System.out.println("Third Character");
                break;
            case 'D':
            case 'd':
                System.out.println("Fourth Character");
                break;
            default:
                System.out.println("Other Characters");
        }




    }

}
