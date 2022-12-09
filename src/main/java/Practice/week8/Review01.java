package Practice.week8;

import java.util.Scanner;

public class Review01 {

    public static void main(String[] args) {
        //Ask user to enter his/her name, surname and credit number and convert all characters in
        //name and surname to asterics except for the initials. Also convert all numbers in credit card to
        //asterics except for the last 4 digits
        Scanner input = new Scanner(System.in);
        System.out.println("please, enter your name,surname and credit card number");
        String name = input.nextLine();
        String surname = input.nextLine();
        String creditNumber = input.next();

        System.out.println(name + surname + creditNumber);



       // name = name.substring(0,1).toUpperCase().concat(name.substring(1).replaceAll("\\w","*"));
        //System.out.println(name);
       // name= name.trim().substring(0,1).toUpperCase().substring(1).replace("\\w","*");
       // System.out.println(name);
        // bu yazim yanlis ekrana hicbisey basmiyo

        String name1= name.trim().substring(0,1).toUpperCase();
        String name2 = name.substring(1).replaceAll("\\w","*");
        name= name1+name2;
        System.out.println(name);



       /*
        surname = surname.trim().substring(0,1).toUpperCase().substring(1).replace("\\w","*");
        creditNumber = creditNumber.trim().substring(0,13).replace("\\d","*");
        System.out.println(name+ surname+creditNumber);

        */
    }
}
