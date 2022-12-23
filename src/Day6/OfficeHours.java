package Day6;

import java.util.Scanner;

public class OfficeHours {
    public static void main(String[] args) {


 /*
 Ask the user to enter which day it is
    print which class we have on that day, and the time of the class
    show if there is office hours

    Class days;
    monday- match (7-10)
    wednesday-biology(7-10)
    friday-chemistry(7-10)
    saturday - physics (10-3pm)

    Office hours
    wednesday-biology(5-7)
    friday-chemistry(5-7)

    instructor

    math-ahmet
    bio-gulay
    che-mahmut
    phy-semih

    topic with instructor at time
    ahmet-a
    gulay-b
    mahmut-c
    semih-d

    challenge:
        make each day flexible

            monday
            Monday
            mon

         reduce repeating code


  */

        Scanner input = new Scanner(System.in);
        System.out.println("What is today?");
        String today = input.next();

        switch (today){
            case "monday":
            case "Monday":
            case "mon":
                System.out.println("math class (7-10)");
                break;
            case "tuesday" :
            case "Tuesday":
            case "Tue":
                System.out.println(today);
                break;
            case "wednesday":
            case "Wednesday":
            case "wed":
                System.out.println("biology class (7-10)" + "\n" + "Office hours (5-7)");
                break;
            case "thursday":
            case "Thursday":
            case "Thu":
                System.out.println(today);
                break;
            case "friday":
            case "Friday":
            case "fri":
                System.out.println("chemistry class (7-10)" +"\n" + "Office hours (5-7)");
                break;
            case "saturday":
            case "Saturday":
            case "sat":
                System.out.println("physics class (10-3pm)");
                break;
            case "sunday":
            case "Sunday":
            case "sun":
                System.out.println(today);
                break;
            default:

        }

    }
}
