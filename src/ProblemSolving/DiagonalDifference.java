package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr= new ArrayList<>();
        int a=0;
        int b=0;

        for(int i=0;i<3;i++){
            arr.add(new ArrayList<>());
        }

        arr.get(0).add(11);
        arr.get(0).add(2);
        arr.get(0).add(4);

        arr.get(1).add(4);
        arr.get(1).add(5);
        arr.get(1).add(6);

        arr.get(2).add(10);
        arr.get(2).add(8);
        arr.get(2).add(-12);

        for (int i = 0; i < arr.size(); i++) {
            a+=arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            b+=arr.get(i).get(arr.size()-i-1);
        }

        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("Dif Absoluta: "+Math.abs(a-b));

        /**System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));

        System.out.println(arr.get(0).get(2));
        System.out.println(arr.get(1).get(1));
        System.out.println(arr.get(2).get(0));**/
    }
}
