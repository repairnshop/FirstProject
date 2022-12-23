package Day5;

import java.util.Scanner;

public class OdevDynamic {
    public static void main(String[] args) {

 /*
 Dynamic

Create a double value for the account balance. // 100
Create a double value for how much you want to withdraw // 500

Check the balance after the withdrawal
    if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100

In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over


  */
        Scanner input =new Scanner(System.in);
        System.out.println("How Much do you need cash out?");
        int withDraw = input.nextInt();

        double overDraft =100;
        double accountBalance = 100;
        double balance;
        if(withDraw > accountBalance) {
        balance = accountBalance - withDraw -overDraft;
        }
        else {
            balance = accountBalance -withDraw;
        }
        System.out.println(balance);





    }
}
