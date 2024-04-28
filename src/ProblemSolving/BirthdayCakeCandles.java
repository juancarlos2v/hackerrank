package ProblemSolving;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = List.of(3,2,1,3);

        int max=Collections.max(candles);
        int count=0;

        for (Integer c:candles
             ) {
            if(c==max) count++;
        }
        System.out.println(count) ;
    }
}
