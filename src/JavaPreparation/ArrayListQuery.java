package JavaPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> numbers = new ArrayList<>();
        List<String> result = new ArrayList<>();

        int test = scan.nextInt();

        scan.nextLine();
        for (int i = 0; i < test; i++) {
            int size = scan.nextInt();
            ArrayList<Integer> row = new ArrayList<>(size);
            for (int j = 0; j < size; j++) {
                int d = scan.nextInt();
                row.add(d);
            }
            numbers.add(row);
        }

        //System.out.println("QUERY");
        int testQuery= scan.nextInt();
        for (int i = 0; i < testQuery; i++) {
            int row= scan.nextInt();
            int column= scan.nextInt();
            try {
                int r=numbers.get(row-1).get(column-1);
                result.add(String.valueOf(r));
            } catch (Exception e) {
                result.add("ERROR!");
            }
        }

        for (String out:result
             ) {
            System.out.println(out);
        }
    }
}
