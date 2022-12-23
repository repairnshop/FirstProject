package Day4;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        /*
        inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
   example expected:
      pin: 1552
      ssn: 1234

outputs:

   when the pincode and ssn match the expected print:
      Authentication successful

   when the pincode or ssn are not correct print:
      Authentication failed

   when the pincode was not correct print:
      incorrect pin code

   when the ssn is not correct print:
      invalid ssn
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a pin code");
        int pin = input.nextInt();

        System.out.println("Enter your last four digit of ssn");
        int ssn = input.nextInt();

        if (pin == 1552 && ssn == 1234){
            System.out.println("Authentication successful");
        }
        else if (pin != 1552 && ssn != 1234){
            System.out.println("Authentication failed");
        }
        else if (pin != 1552) {
            System.out.println("incorrect pin code");
        }
        else {
            System.out.println("invalid ssn");
        }

        boolean answerResult = pin != 1552 && ssn != 1234;

        System.out.println(answerResult);



    }

}
