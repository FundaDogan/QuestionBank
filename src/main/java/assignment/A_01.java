package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_01 {
    public static void main(String[] args) {

         /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.
            */

        Scanner input = new Scanner(System.in);

        List<String> list = new ArrayList<>();

       for (int i=0; true; i++){

           System.out.println("please, enter an integer ,to stop enter S");
           String num = input.next();
           if (num.equalsIgnoreCase("S")){
               break;
           }
           list.add(num);
       }
        System.out.println(list);




        List<String> list1 = new ArrayList<>();
        do {
            System.out.println("please, enter the elements you want to remove, when done enter D");
            String elementToMove = input.next();
            if (elementToMove.equalsIgnoreCase("D")){
                break;
            }
            list1.add(elementToMove);

        }while (true);

        list.removeAll(list1);
        System.out.println(list);




        int i=0;
        while (true){
            System.out.println("please, enter the elements you want to update, when done, enter F");
            String elementsToUpdate = input.next();
            if (elementsToUpdate.equalsIgnoreCase("F")) {
                break;
            }
            list.set(list.indexOf(elementsToUpdate),"7");
            i++;
        }
        System.out.println(list);



    }

}
