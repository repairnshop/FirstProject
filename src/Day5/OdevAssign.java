package Day5;

import java.util.Scanner;

public class OdevAssign {

    public static void main(String[] args) {


 /*

 Task:

   Declare and assign a number

   I want to know the sign of the number
   if the number positive
   is the number negative
   is the number 0

   */
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");

        int number =input.nextInt();

        String result = (number >0)?"positive" :(number < 0)?"negative":"0";
        System.out.println(result);





    }
}
