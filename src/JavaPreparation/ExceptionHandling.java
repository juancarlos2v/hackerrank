package JavaPreparation;

import java.util.Scanner;

class MyCalculatorPow {

    public long power(int p, int n) throws Exception {
        if (p == 0 && n == 0) throw new Exception("n and p should not be zero.");
        if (p< 0 || n< 0)  throw new Exception("n or p should not be negative.");
        return (long) Math.pow(p, n);
    }
}

public class ExceptionHandling {
    public static final MyCalculatorPow my_calculator = new MyCalculatorPow();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
