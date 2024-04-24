package JavaPreparation;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int cases= scan.nextInt();
        scan.nextLine();
        for (int i = 0; i <cases ; i++) {
            String expresion= scan.nextLine();
            try{
                Pattern.compile(expresion);
                System.out.println("Valid");
            }catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}
