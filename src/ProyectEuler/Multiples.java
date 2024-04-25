package ProyectEuler;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i <t ; i++) {
            long n = in.nextLong();
            System.out.println(sum(n));
        }
    }

    static long sum( long n) {
        long n3=(n-1)/3;
        long n5=(n-1)/5;
        long n15=(n-1)/15;
        return  (3*n3*(n3+1))/2 +(5*n5*(n5+1))/2-(15*n15*(n15+1))/2 ;
    }

}

/**
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int t = in.nextInt();

 for (int i = 0; i <t ; i++) {
 long n = in.nextLong();
 Long sum= multiples(n);
 System.out.println(sum);
 };
 }

 static long multiples( long n) {
 long sum = 0;
 for (int i = 0; i < n; i++) {
 if (i%5==0||i%3==0) {
 sum += i;
 }
 }
 return sum;
 }
 * **/
