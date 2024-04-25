package ProyectEuler;

import java.util.Scanner;

public class EvenFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(sum(n));

        }
    }
    static long sum(long n) {
        long first = 1;
        long second = 2;
        long third=0;

        long sum = 0;

        while(third <= n){
            if(second%2 == 0){
                sum+=second;
            }
            third=first+second;
            first=second;
            second=third;
        }
        return sum;
    }
}
