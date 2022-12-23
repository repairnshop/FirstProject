package Day6;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to have?" + "\n" + "1-) Drinks" + "\n" + "2-) Snacks" + "\n" + "3-) Gum");
        String options = input.next();
        String result = "";



        switch (options){
            case "Drinks":
                System.out.println("1-) Coke" + "\n" + "2-) Pepsi" + "\n" + "3-) Sprite");
                int option1 = input.nextInt();
                if (option1 ==1){
//                    System.out.println("Coke");
                    result = "Coke";
                }
                else if (option1 == 2){
//                    System.out.println("Pepsi");
                    result = "Pepsi";
                }
                else if (option1 == 3) {
//                    System.out.println("Sprite");
                    result = "Sprite";
                }
                break;
            case "Snacks":
                System.out.println("1-) Chips" + "\n" + "2-) " + "Oreo" + "\n" + "3-) Bueno");
                option1 = input.nextInt();

                if (option1 ==1){
//                    System.out.println("Chips");
                    result = "Chips";
                }
                else if (option1 == 2){
//                    System.out.println("Oreo");
                    result = "Oreo";
                }
                else if (option1 == 3) {
//                    System.out.println("Bueno");
                    result = "Bueno";
                }
                break;
            case "Gum":
                System.out.println("1-) Bubble" + "\n" + "2-) Falim" + "\n" + "3-) Hophop");

                option1 = input.nextInt();
                if (option1 ==1){
//                    System.out.println("Bubble");
                    result = "Bubble";
                }
                else if (option1 == 2){
//                    System.out.println("Falim");
                    result = "Falim";
                }
                else if (option1 == 3) {
//                    System.out.println("Hophop");
                    result = "Hophop";
                }
                break;
                default:





        }
        System.out.println("Your choose is " +result );





    }
}
