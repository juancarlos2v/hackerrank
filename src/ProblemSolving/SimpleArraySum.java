package ProblemSolving;

import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3);
        int sum=0;

        for (int n:nums){
            sum+=n;
        }

        System.out.println(sum);
    }
}
