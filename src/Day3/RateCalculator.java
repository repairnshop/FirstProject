package Day3;

import com.sun.source.tree.IfTree;

import java.sql.SQLOutput;
import java.sql.Time;
import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Salary");
        double salary = input.nextDouble();
        System.out.println("Your salary is " + salary);

        Scanner totalHours = new Scanner(System.in);
        System.out.println("Guess, How many hours he/she works in a week?");
        int hours = totalHours.nextInt();
        System.out.println("She/He works " + hours + " hours");

        int hoursWeekly= 52;
        double hourlyRate = salary / hoursWeekly;
        System.out.println("His/Her hourlyRate is " +hourlyRate);

        Scanner threeAngle = new Scanner(System.in);
        System.out.println("Enter 3 Angle Numbers");
        float Number1 = threeAngle.nextFloat();
        float Number2 = threeAngle.nextFloat();
        float Number3 = threeAngle.nextFloat();
        float totalAngle = Number1 + Number2 + Number3;
        System.out.println("it is triangle " + (totalAngle == 180) +"\n" + "it is a circle " + (totalAngle ==360));
        if (totalAngle == 180){
            System.out.println("its triangle");
        }
        else if (totalAngle==360) {

            System.out.println("Circle");
        }
        else {
            System.out.println("Yamuk");
        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input2.nextInt();
        boolean odd = number % 2 !=0;
        boolean even = number % 2 ==0;
        System.out.println("odd " + odd);
        System.out.println("even " + even);
        System.out.println((number % 2 ==0) + " even" +"\n"+ (number % 2 !=0) + " odd");
        System.out.println(odd +" "+ even);
        if (odd){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }











        }


    }

