package JavaPreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoDArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        /**IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );


            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });**/
        bufferedReader.close();
        arr.add(List.of(1, 1, 1, 0, 0, 0));
        arr.add(List.of(0, 1, 0, 0, 0, 0));
        arr.add(List.of(1, 1, 1, 0, 0, 0));
        arr.add(List.of(0, 0, 2, 4, 4, 0));
        arr.add(List.of(0, 0, 0, 2, 0, 0));
        arr.add(List.of(0, 0, 1, 2, 4, 0));

        for (List<Integer> row:arr
             ) {
            System.out.println(row);
        }

        for (int i = 0; i < arr.size(); i++) {

        }

    }
}
