package JavaPreparation;

import java.util.Scanner;

public class BigInteger {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        java.math.BigInteger a= scan.nextBigInteger();
        java.math.BigInteger b= scan.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }


}
