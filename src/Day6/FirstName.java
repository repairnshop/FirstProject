package Day6;

public class FirstName {
    public static void main(String[] args) {

    /*
    first name
    last name

    fix to print proper name:
    capital first letter, the rest of the letter lowercase,  no extra space

     */
        String firstName,lastName;
        firstName = "ergun";
        lastName = "kucukyilmaz";

        System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1)+lastName.substring(0,1).toUpperCase() +lastName.substring(1));








    }
}
