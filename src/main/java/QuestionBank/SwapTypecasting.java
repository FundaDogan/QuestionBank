package QuestionBank;

public class SwapTypecasting {
    public static void main(String[] args) {
        //7) Type a code to swap two integers

        //1) Create a short variable and convert it to an int variable.

        short s=12;
        int i=s;
        System.out.println(s+" "+i);

        //2) Create a long variable and convert it to an int variable

        long l=3000000000l;
        int i1=(int)l;
        System.out.println(l+" "+i1);

        //3) Create a double variable and convert it to a float variable

        double d=1.3;
        float f= (float)d;
        System.out.println(d+" "+f);

        /*4) Create a double variable and convert it to a short variable, then print
        the value of the short variable on the console. Be careful about the output,
         it will not be a decimal value.
        */

        double d1=3.4;
        short s1=(short)d1;
        System.out.println(s1);

        /*5) Create a byte variable and convert it to a double variable, then print the value
        of the double variable on the console. Be careful about the output,
        it will be a decimal number.
        */
        byte b=4;
        double d2=b;
        System.out.println(d2);







    }
}
