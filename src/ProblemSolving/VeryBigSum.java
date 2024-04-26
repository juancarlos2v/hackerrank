package ProblemSolving;

import java.util.List;

public class VeryBigSum {
    public static void main(String[] args) {
        List<Integer> arr=List.of(1000000001, 1000000002, 1000000003, 1000000004, 1000000005);

        long sum=0;

        for (Integer n:arr){
            sum += n;
        }
        System.out.println(sum);
    }
}
