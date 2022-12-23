package Day6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {



  /*

  declare and assign 2 number variables
declare and assign a char variable for an operator

create a calculator based on the operator picked
    + : add num1 and num2
    - : minus num1 and num2
    * : multiply num1 and num2
    / : divide num1 and num2
    any other char: "invalid operator"


   */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number =input.nextInt();
        System.out.println("Enter Second Number");
        int number1 = input.nextInt();
        int result ;

        System.out.println("Which operator do u want use?");
        String operator = input.next();

        switch (operator){
            case "+":
                result = number + number1;
                System.out.println(result);
                break;
            case "-":
                result = number -number1;
                System.out.println(result);
                break;
                case "*" :
                result =number * number1;
                System.out.println(result);
                break;
            case "/" :
                result = number / number1;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid operator");
        }



    }

}
