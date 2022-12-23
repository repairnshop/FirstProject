package Day4;

import java.util.Scanner;

public class HouseOdev {
    public static void main(String[] args) {

       /*
      We are buying a house
    ask the user for their budget (single number, max)

    Find the area that the user's budget fits into and provide all the information of the neighborhood

    extra condition: if the user gives a budget value below 0, it is invalid,
    so print: "That is not a valid budget".
    If the budget is more than 300,000 print "Too much money for this agency"

    Data based on neighborhood name:
        name - Hills
        average price - 80,000 - 100,000
        rating - 4.0
        gated - no
        allow pets - yes

        name - Oaks
        average price - 55,000 - 75,000
        rating - 3.5
        gated - no
        allow pets - yes

        name - Highland
        average price - 120,000 - 150,000
        rating - 4.5
        gated - yes
        allow pets - no

        name - Canyon
        average price - 160,000 - 201,000
        rating - 4.8
        gated - yes
        allow pets - yes

        If the budget is no in any range print: "No available houses"

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Are you buying a house?");
        boolean house = input.nextBoolean();
        System.out.println("Whats your max budget?");

        int budget = input.nextInt();

        String house1 = "House is located " + "\n" + "in Hills" + "\n" + "rating - 4.0" + "\n" + "gated - no" + "\n" + "allow pets - yes";
        String house2 = "House is located " + "\n" + "in Oaks" + "\n" + "rating - 3.5" + "\n" + "gated - no" + "\n" + "allow pets - yes";
        String house3 = "House is located " + "\n" + "in Highland" + "\n" + "rating - 4.5" + "\n" + "gated - yes" + "\n" + "allow pets - no";
        String house4 = "House is located " + "\n" + "in Oaks" + "\n" + "rating - 4.8" + "\n" + "gated - yes" + "\n" + "allow pets - yes";

        if (budget >= 80 && budget <= 100) {
            System.out.println(house1);
        }
        else if (budget >= 55 && (budget <= 75)) {
            System.out.println(house2);
        }

        else if (budget >= 120 && budget <= 150) {
            System.out.println(house3);
        }
        else if (budget >= 160 && budget <= 201) {
            System.out.println(house4);
        }
        else if (budget == 0) {
            System.out.println("it is invalid");
            System.out.println("That is not a valid budget");
        }
        else if (budget >300000) {
            System.out.println("Too much money for this agency");
        }
        else {
            System.out.println("No available houses");
        }





    }
    }
