package QuestionBank;

public class Soru01 {

    public static void main(String[] args) {

        /*5) Create two boolean variables whose values are different
         and print their values in the same line with a space between two consecutive values.
         */
         boolean b1= true;
         boolean b2=false;

        System.out.println(b1+" "+b2);

        /*6) Create 3 float variables for the price of a book, notebook, and laptop.
                Print the total price of 2 books, 4 notebooks and 3 laptops on the console.
         */

        float book= 9.88f, notebook= 7.87f, laptop= 677.9f;
        float totalPrice= 2*book+ 4*notebook + 3*laptop;
        System.out.println("Total price is " +totalPrice);




    }
}
