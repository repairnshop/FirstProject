package Day6;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {


//        Scanner input = new Scanner(System.in);
//        System.out.println("enter your name");
//        String name = input.next();
//        name = "ergun";
//        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1,2)+ name.substring(2,3).toUpperCase() + name.substring(3,4) + name.substring(4,5).toUpperCase());
//        System.out.println("how letters has it?");
//        System.out.println(name.length());

    String str;
    str = "atakucukyilmaz";
    System.out.println(str.length());
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1,3) + " " + str.substring(3,4).toUpperCase() + str.substring(4) + "\n" + str.substring(0,1).toUpperCase()+"."+ str.substring(3,4).toUpperCase()
        );
        str = "PERIKUCUKYILMAZ";
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0,1) + str.substring(1).toLowerCase());
        System.out.println(str.substring(0,1)+str.substring(1,4).toLowerCase() + " " + str.substring(4,5)+str.substring(5).toLowerCase());
        System.out.println(str.startsWith("P"));





    }
}
