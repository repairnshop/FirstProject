package Day4;

import java.util.Scanner;

public class HouseOdev2ternay {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("Are you buying a house?");
        boolean house = input.nextBoolean();
        System.out.println("Whats your max budget?");

        int budget = input.nextInt();

        String house1 = "House is located " + "\n" + "in Hills" + "\n" + "rating - 4.0" + "\n" + "gated - no" + "\n" + "allow pets - yes";
        String house2 = "House is located " + "\n" + "in Oaks" + "\n" + "rating - 3.5" + "\n" + "gated - no" + "\n" + "allow pets - yes";
        String house3 = "House is located " + "\n" + "in Highland" + "\n" + "rating - 4.5" + "\n" + "gated - yes" + "\n" + "allow pets - no";
        String house4 = "House is located " + "\n" + "in Oaks" + "\n" + "rating - 4.8" + "\n" + "gated - yes" + "\n" + "allow pets - yes";

        String result = (budget >= 80 && budget <= 100)?house1:(budget >= 55 && budget <= 75)?house2:(budget >= 120 && budget <= 150)?house3:(budget >= 160 && budget <= 201)?house4:(budget == 0)?"That is not a valid budget":(budget >300)?"Too much money for this agency":"No available houses";
        System.out.println(result);




    }
}
