package Practice.week6;

public class Q01_SumOfFirstIntWithNums {
       /*
       Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         a*(b+c+d+f)
    */

    public static void main(String[] args) {
        myMethod(7,2,4,5,6);
        myMethod(0,8,9,5);
        myMethod(-1,5,7,38);

        myMethod(3.4,2,3,4);
        myMethod(3.4,5.2, 9.8, 4.6);


    }

    public static void myMethod(int a, int ...numbers){

        int sum=0;
        for (int w:numbers){
            sum+=w; // different way of typing sum = sum+w;  sum will be increased by "w"
        }
        System.out.println(a*sum);
    }

    public static void myMethod(double a, int ...numbers){

        int sum=0;
        for (int w:numbers){
            sum+=w; // different way of typing sum = sum+w;  sum will be increased by "w"
        }
        System.out.println(a*sum);
    }

    public static void myMethod(double a, double ...numbers){

        double sum=0;
        for (double w:numbers){
            sum+=w; // different way of typing sum = sum+w;  sum will be increased by "w"
        }
        System.out.println(a*sum);
    }
}
