package JavaPreparation;

import java.util.ArrayList;
import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //String s= scan.nextLine();
        scan.close();


        String s= "                        ";
        if(!s.trim().isEmpty()){
            String[] words =s.trim().split("[\\s+\\p{Punct}]+");
            System.out.println(words.length);
            for (String w:words){
                System.out.println(w);
            }
        }
        else{
            System.out.println(0);
        }



    }
}
