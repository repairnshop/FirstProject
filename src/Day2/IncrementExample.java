package Day2;

public class IncrementExample {
    public static void main(String[] args) {


        int x = 0;
        System.out.println(x); // 0
        x++; // post increment
        System.out.println(x); // 1
        System.out.println(x++);// 1 post increment // when you run as 'x' it will be increase to "2"
        System.out.println(x); // 2

        int y = 4;
        System.out.println(y); // 4
        ++y; // pre increment
        System.out.println(y); // 5
        System.out.println(++y);// 6 pre increment // when you run as "y" result will increase directly as "6"

        int e = 5;
        int z = e++;

        System.out.println(e); // 6 post increment
        System.out.println(z); // post increment "e" still same. it will increase when i use it on next first time.





    }
}
