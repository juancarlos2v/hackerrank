package ProblemSolving;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {

        //List<Integer> arr= List.of(1,2,3,4,5);
        List<Integer> arr= List.of(5,5,5,5,5);
        //List<Integer> arr= List.of(793810624, 895642170, 685903712, 623789054, 468592370);
        //List<Integer> arr= List.of(140638725, 436257910, 953274816, 734065819, 362748590);
        List<BigInteger> l= new ArrayList<>();
        BigInteger sum= BigInteger.valueOf(0);

        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.size() ; j++) {
                if (j!=i ) {
                    sum=sum.add(BigInteger.valueOf(arr.get(j)));
                }
            }
            l.add(sum);
            sum= BigInteger.valueOf(0);
        }
        System.out.print(Collections.min(l) +" "+Collections.max(l));
    }
}
