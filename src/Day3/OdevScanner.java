package Day3;

import java.util.Scanner;
import java.util.StringJoiner;

public class OdevScanner {
    public static void main(String[] args) {

        /*
        Task
        Get the answer of these questions from the user using Scanner
            is it the weekend
            are you a teacher
            are you a police officer
            are you a firefighter
         */

        Scanner input = new Scanner(System.in);

        System.out.println("is it weekend?");

        boolean weekend = input.nextBoolean();

        if (weekend) {
            System.out.println("yes, today is weekend");
        } else {

            System.out.println("no,its not weekend");

        }


        System.out.println("are you a teacher?");
        boolean yes = input.nextBoolean();

        if (yes) {
            System.out.println("yes im a teacher");

        } else {


            System.out.println("No Iam not");
        }
        System.out.println("are you a police officer");




    }

}



















