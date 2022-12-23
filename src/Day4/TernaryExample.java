package Day4;

import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {

        /*
        Task:
    declare and assign a price variable
    declare and assign a boolean - hasPrime variable

    possible outputs:

        prime member:
            Eligible for 2 day shipping

        not prime and item price is more than or equal 25:
            Eligible for regular free shipping

        not prime and item price is less than 25:
            Not eligible for free shipping. Shipping fee: 3.99


         */

        Scanner input =new Scanner(System.in);
        System.out.println("Whats item price");
        double price = input.nextDouble();
        System.out.println("does customer have prime account");
        boolean hasPrime =input.nextBoolean();

        String result = (hasPrime)?"Eligible for 2 day shipping" : (price >= 25) ? "Eligible for regular free shipping" : "Not eligible for free shipping. Shipping fee: 3.99";
        System.out.println(result);

    }
}