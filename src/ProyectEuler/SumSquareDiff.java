package ProyectEuler;

import java.util.Scanner;

public class SumSquareDiff {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n=scan.nextInt();
        long sum=  ((long) n *(n+1)) /2;
        long sumSq=(n*(n+1)*(2L *n+1))/6;
        long result= (long) ((Math.pow(sum,2)) -sumSq);

        System.out.println((int)result);


    }
}
