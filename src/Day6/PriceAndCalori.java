package Day6;

import java.util.Scanner;

public class PriceAndCalori {

    public static void main(String[] args) {


  /*
  Declare price and calories variables

Ask the user to enter which size drink they want

Based on the drink size determine the price and calories of the order

At the end print the details of the order

    data:

        size: tall
        price: 2.50
        calories: 100

        size: grande
        price: 4.00
        calories: 150

        size: venti
        price: 4.50
        calories: 200


   */


        Scanner input = new Scanner(System.in);
        System.out.println("enter which size drink you want");
        String size =input.next();

        switch (size){
            case "tall":
                System.out.println("you picked " + "" + size + "" +"size");
                System.out.println("price: 2.50" + "\n" + "calories: 100");
                break;
            case "grande":
                System.out.println("you picked " + "" + size + "" +"size");
                System.out.println("price: 4.00" + "\n" + "calories: 150");
                break;
            case "venti":
                System.out.println("you picked " + "" + size + "" +"size");
                System.out.println("price: 4.50" + "\n" + "calories: 200");
                break;
            default:


        }
    }
}
