package Practice.week8;

public class Q03_CalculationOfAverage {

    // Create a method to calculate 4 students' 3,4,6 and 5 exams' average respectively.

    public static void main(String[] args) {

        calculateAverage("Ali", 55,65,40,87);
    }

    public static void calculateAverage(String stdName, double...mark){

        double sum =0;
        for (double w: mark){
            sum+= w;
        }
        System.out.println(stdName+ "'s Average of Exams: "+ String.format("%.2f",sum/mark.length));
    }
}
