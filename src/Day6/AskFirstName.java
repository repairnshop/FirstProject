package Day6;

import java.util.Scanner;

public class AskFirstName {
    public static void main(String[] args) {

 /*
  Ask the user to enter their first name

    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB

  */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName =input.next();
        firstName = "james";

        System.out.println("Enter your last name");
        String lastName = input.next();
        lastName = "bond";

        System.out.println(firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase());





    }
}
