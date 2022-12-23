package Day6;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a account number");
        String accountNumber = input.nextLine();

        // acount number - 23 78221
        // account number- 2878831
        //account number -5789211120

        if (accountNumber.contains(" ")) {
            System.out.println("Empty input given");
        }
            else if (accountNumber.startsWith("2") && accountNumber.length() == 7) {
                System.out.println("7 digit Valid account number");
            }

            else if (accountNumber.startsWith("5") && accountNumber.length() == 10) {
                System.out.println("10 digit Valid number");
            }

            else {
                System.out.println("invalid number");

            }

        }
    }