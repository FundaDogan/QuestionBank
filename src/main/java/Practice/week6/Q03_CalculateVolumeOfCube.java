package Practice.week6;

public class Q03_CalculateVolumeOfCube {

        //Create a method to calculate volume of cube, square prism and rectangular prism.
            //a*a*a ==> gives you the required outcome.Only one edge length is enough to calculate
     public static void main(String[] args) {

         System.out.println("Volume of the Cube = "+ volumeOfCube(4));
         System.out.println("Volume of Square Prism = "+ volumeOfSquarePrism(3,4));
         System.out.println("Volume of Rectangular Prism = "+ volumeOfRectangularPrism(3,4,5));
   }

        public static int volumeOfCube(int a){

         int volumeOfCube = a*a*a;
         return volumeOfCube;
        }

        public static int volumeOfSquarePrism(int a, int h){
         int volumeOfSquarePrism= a*a*h;
         return volumeOfSquarePrism;
        }

        public static int volumeOfRectangularPrism(int a, int b, int c){
         int volumeOfRectangularPrism = a*b*c;
         return volumeOfRectangularPrism;
        }

}
