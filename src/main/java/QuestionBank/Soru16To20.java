package QuestionBank;

public class Soru16To20 {
    public static void main(String[] args) {
        //soru1
       long a = 1234;
       long b= 1234L;
       long c = 8234567890l;
       long d = 8234567890L;

        System.out.println(Integer.MAX_VALUE);

        // soru2

       // int result = 10/2.5 + 1;   bu compile time error verir cunku 2.5 int degil.
        //System.out.println(result);

        // soru3

        char y='a';
        System.out.println(y>=0 && y<9 ? 11 : "Java");

        char ch = 'm';
        System.out.println(ch>='a' && ch<='z' ? "Bad" : "Good");

        //soru5
        int variable = 1;
        switch (variable){
            case 1 :
                System.out.print("P");
            case 2 :
            case 3 :
                System.out.print("Q");
                break;
            case 4 :
                System.out.print("R");
            default :
                System.out.print("S");
        }
        System.out.println();

        // soru 6

        String str = "Hello World!";
        System.out.println(str.length() > str.charAt(6));      // prints false on the console.

        int i= 5;
        char ch1 ='a';
        System.out.println(i-ch1);   // int ve char arasina carpma bolme cikarma , <,> yazilabilir.

        // soru7
        String str1 = "Learn java, earn money";
        System.out.println(str1.replace("Learn", "?"));


        // soru 4
        printAge(23);

    }
           public static void printAge(int age){
            System.out.println(age);

    }
}
