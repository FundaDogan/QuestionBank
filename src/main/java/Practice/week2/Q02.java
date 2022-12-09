package Practice.week2;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
  Ask user to enter his weight and height. Calculate body index of the user.
  To calculate body mass index use "bodyMassIdx = weight / squareOfHeigth" formula.
   ** 1) body mass inx less than 18.5 ==> "You are weak".
   ** 2) bodyMassInx between 18.5 -25 ==> Your weight is ideal
   ** 3) bodyMassIndex between 25-30 ==> You are fat
   **4) bodyMassIndex greater than 30 ==> Obese

  */
        Scanner input = new Scanner(System.in);
        System.out.println("pls, enter your weight");
        double weight = input.nextDouble();

        System.out.println("please, enter your height");
        double height = input.nextDouble();

        double bodyMassIdx = weight/(height*height);
        System.out.println(bodyMassIdx);

        if(bodyMassIdx>0 && bodyMassIdx<18.5){
            System.out.println("You are weak");
        }else if (bodyMassIdx<25){
            System.out.println("Your weight is ideal");
        }else if (bodyMassIdx<30){
            System.out.println("You are fat");
        }else if (bodyMassIdx>30){
            System.out.println("You are obese");
        }else{
            System.out.println("pls, enter a valid data");
        }

        input.close();
    }


    }

