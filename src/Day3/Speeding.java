package Day3;

import java.util.Scanner;

public class Speeding {
    public static void main(String[] args) {


        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your speeding");

        int speeding = Input.nextInt();
        int speedLimit = 60;
        int currentSpeeding = speeding;

        boolean result = speeding <= speedLimit;

        Scanner input2 = new Scanner(System.in);
        System.out.println("Is he speeding?");
        String input3 = input2.toString() + "Is he speeding?";

        if (result) {
            System.out.println("False " + "He is not speeding");
        }
        else{
                System.out.println("True " + "He is speeding");

            }

        }
        }




