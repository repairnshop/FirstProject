package Day3;

import java.util.Scanner;

public class FirstScanner {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a number");
//        int number = input.nextInt();
//        System.out.println("Your number is "+ number);
//
//        System.out.println("Please enter city name");
//        String cityName = input.next();
//        System.out.println("Your city name is " +cityName);

        Scanner sayi = new Scanner(System.in);
        System.out.println("Please enter a sayi1 ");
        int sayi1 = sayi.nextInt();
        System.out.println((sayi1 % 2 == 0 )+" Even");
        System.out.println((sayi1 % 2 != 0 )+ " Odd");




    }
}
