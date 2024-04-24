package JavaPreparation;
import java.util.ArrayList;
import java.util.Collections;

public class Lexicographically {
    public static void main(String[] args) {
        String smallest = "";
        String largest = "";
        String s="welcometojava";
        int k=3;
        int largo=s.length();
        //int limite= (int) Math.ceil((float)largo/k);
        //int endIndex;
        //System.out.println("cantidad de strings en array:: "+limite);
        System.out.println("tamaño:: "+largo);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //parar en cada caracter, agarrar los 2 siguientes substring (3)
        ArrayList<String> words= new ArrayList<>();
        String w;
        for(int i=0; k<=largo;i++) {
            //endIndex = (i * k + k >= largo) ? largo : i * k + k;
            // endIndex= (k==largo)?largo-1:k;
            //System.out.println("substring: "+i + " " + endIndex);
            w = s.substring(i , k);
            words.add(w);
            k++;
            //System.out.println("-----------------------------------");
            /**for(int j=0;j<largo;j++){
             System.out.println("substring: "+(i+1) + " " + (j+3));
             }**/
        }

        Collections.sort(words);
        smallest=words.get(0);
        largest=words.get(words.size()-1);
        System.out.println(words);
        System.out.println(smallest + "\n" + largest);
    }

}
/**
 * 0 3
 * 1 4
 * 2 5
 * **/