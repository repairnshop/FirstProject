package Day1;

public class CellPhone {
    public static void main(String[] args) {

        String brand , color, model;
        brand = "Apple";
        color = "black";
        model = "Iphone 10";

        int storage;
        storage = 128;

        double price;
        price = 1000.99;

        boolean hasCamera = true;

        char sim = 'A';

        String data = "I do have sale phone which brand is" + " "+
                brand+ " model is" + " " +model+ " " + "has memory " +storage+
                "\n"+"price is " +price+"\n"+"does have camera " +hasCamera+
                "\n"+ "which works with " +sim+ " sim card";


        System.out.println(data);






    }
}
