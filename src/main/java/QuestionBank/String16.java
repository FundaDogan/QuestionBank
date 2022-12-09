package QuestionBank;

public class String16 {
    public static void main(String[] args) {

        /*16) Type code to get initials of the first name and the last name of a given name. Middle name is out of scope.
                Example: Tom Hanks ==> TH, Mary Star ==> MS

         */

        String name = "Funda Acar";

        String trimmedName = name.trim();
        String firstInitialOfFirstName = trimmedName.substring(0,1);
        String firstInitialOfLastName = trimmedName.split(" ")[1].substring(0,1);
        System.out.println(firstInitialOfFirstName+firstInitialOfLastName);

        // hoca 2 yolla cozmu ama ilki dogru degil cunku kullanici isim soyisim arasina iki tane bosluk koyabilir hata ile.

        /*
        17) Type a code to find the number of punctuation marks used in a String.
         */

        String s = "Funda !!...";
        int length = s.replaceAll("\\P{Punct}","").length();
        System.out.println(length);





    }
}
