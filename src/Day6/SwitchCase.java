package Day6;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number : 1-7");
        int number = input.nextInt();
        String day;

        switch (number) {
            case 1:
                day = "Monday"; //System.out.println("Monday");
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Its not a day";
        }

                System.out.println(day);


        }
    }
