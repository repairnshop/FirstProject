package Day6;

public class DetailOfString {
    public static void main(String[] args) {

        String str = "ergun";
        System.out.println(str.charAt(0));// 'e'
        System.out.println(str.toUpperCase());//"ERGUN"
        System.out.println(str.endsWith("e"));//"false"
        System.out.println(str.substring(0));//"ergun"
        System.out.println(str.substring(0,2));//"er"
        System.out.println(str.startsWith("e"));//"true
        System.out.println(str.length());//"5" harfli
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));//Ergun



    }
}
