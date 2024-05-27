package JavaPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuery {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        List<List<Integer>> numbers=new ArrayList<>();

        int n =scan.nextInt();
        scan.nextLine();
        for (int i = 0; i <n ; i++) {
            List<Integer> row=new ArrayList<>();
            int size = scan.nextInt();
            // Capturar el primer número antes de ingresar al bucle para los demás números
            row.add(size);
            // Leer los números restantes en la misma línea
            for (int j = 0; j < size; j++) {
                int d = scan.nextInt();
                row.add(d);
            }
            numbers.add(row);
        }
        System.out.println(numbers);
    }
}
