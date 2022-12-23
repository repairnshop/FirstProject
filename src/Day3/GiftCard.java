package Day3;

public class GiftCard {

    public static void main(String[] args) {

        double giftCard = 200;
        System.out.println("Buy item for 50$");

        giftCard -= 50;
        System.out.println(giftCard);// 150

        giftCard += 100;
        System.out.println(giftCard);//250

        giftCard /= 2;
        System.out.println(giftCard);//125

        int a = 10;
        int b = 5;
        System.out.println(a > b);//true
        System.out.println(a >= b);//true
        System.out.println(b <= a);//true
        System.out.println(b < a);//true
        System.out.println(a < b);//false
        System.out.println(a == b);//false
        System.out.println(a != b);//true

        int c = 15;

        System.out.println(a > b && c >= a + b);//true "&&" both has to be true to get true result
        System.out.println(a > b || b > c);// true  "||" just one will be enough to get true result
        System.out.println(a < b || b > c);//false

        int number1 = 6;
        int number2 = 2;
        System.out.println(number1 / number2);//3
        System.out.println(number1 % number2);//0 "%" it will give you after you divided tne number "kalan"

        int number3 = 5;
        System.out.println(number1 % number3);// 1 "kalan"

        System.out.println(number1 % 2 ==0 );// even number
        System.out.println(number3 % 2 != 0);// odd number
        System.out.println(number1 % 2 != 0);// false





        System.out.println(12 + 5 * 2);//22
        System.out.println((12+5) * 2);//34
        System.out.println(12 / 2 * 5);//30



    }
}
