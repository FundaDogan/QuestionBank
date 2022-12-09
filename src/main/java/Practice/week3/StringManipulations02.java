package Practice.week3;

public class StringManipulations02{

    public static void main(String[] args) {

        // get the initials from full name. Middle name is out of scope

        // Tom Hanks ==> TH

            String s= "    Tom Hanks   ";

            String initialOfFirstName = s.trim().substring(0,1).toUpperCase();
            String initialOfLastName = s.trim().split(" ")[1].substring(0,1).toUpperCase();
            System.out.println(initialOfFirstName+initialOfLastName);






    }
}
