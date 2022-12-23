package Day6;

import java.util.Scanner;

public class MiddleCrh {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word =input.next();

//      word- samanlikta
//            012345  3,5  4-1 4+1s
        //              4 6  5-1 5+1
//        word1-haydi

      if (word.length()%2==0){
          System.out.println(word.substring(word.length()/2-1,word.length()/2+1));


      }






    }
}
