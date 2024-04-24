package JavaPreparation;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String x=scan.nextLine();
        //String y =scan.nextLine();
        String x = "java";
        String y = "avAj";

        if (x.length() != y.length()) {
            System.out.println("Not JavaPreparation.Anagrams");
        } else {
            HashMap letters_x = countLetters(x.toLowerCase());
            HashMap letters_y = countLetters(y.toLowerCase());

            System.out.println(x);
            System.out.println(letters_x);

            System.out.println(y);
            System.out.println(letters_y);

            if(letters_x.equals(letters_y)){
                System.out.println("JavaPreparation.Anagrams");
            }else{
                System.out.println("Not JavaPreparation.Anagrams");
            }
        }
    }

    public static HashMap countLetters(String str) {
        HashMap<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int contador = 0;
            letters.put(str.charAt(i), contador);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    contador++;
                    letters.put(str.charAt(i), contador);
                }
            }
        }
        return letters;
    }
}
