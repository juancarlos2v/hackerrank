package JavaPreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        String n= bufferedReader.readLine();
        bufferedReader.close();

        BigInteger p= new BigInteger(n);
        //String result=prime(p);
        //System.out.println(result);
        if(p.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }


    public static String prime(BigInteger a){
        for (int i = 2; a.compareTo(BigInteger.valueOf(i))>0 ; i++) {
            if(a.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)){
                return "not prime";
            }
        }
        return "prime";
    }
}
