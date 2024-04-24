package JavaPreparation;

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word= scan.next();

        StringBuilder wordBuilder=new StringBuilder(word);
        String wordReverse=new StringBuilder(wordBuilder.reverse()).toString();

        System.out.println(wordReverse);
        System.out.println(wordBuilder);

        if(word.equals(wordReverse)) System.out.println("Yes");
    }
}
