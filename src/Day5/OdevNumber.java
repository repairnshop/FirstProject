package Day5;

import java.util.Scanner;

public class OdevNumber {
    public static void main(String[] args) {

/*
you will have a number

   if the number is divisible by 3 print -> Fizz
   if the number is divisible by 5 print -> Buzz
   if the number is divisible by both 3 and 5 -> FizzBuzz
   if the number is not divisible by any of those, print just the number

*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = input.nextDouble();

        String result = ((number % 3 == 0) ? "Fizz" : (number % 5 == 0) ? "Buzz" : (number % 3 == 0 && number % 5 == 0) ? "FizzBuzz" : number+"" );
        System.out.println(result);
    }

}
