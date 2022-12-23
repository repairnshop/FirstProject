package Day3;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("do you get a discount");
        boolean discount = input.nextBoolean();

        if (discount) {
            System.out.println("yes i do get a discount");
        }
            else {
                System.out.println("No I dont get a discount");

            }
        }
    }

