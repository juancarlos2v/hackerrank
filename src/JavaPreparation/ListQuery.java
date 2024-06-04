package JavaPreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListQuery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();

        String[] input = br.readLine().trim().split("\\s+");

        if (input.length != size) throw new IOException();

        for (String str : input) {
            nums.add(Integer.parseInt(str));
        }

        System.out.println(nums);
        int test = Integer.parseInt(br.readLine());

        while (test > 0) {
            String consult = br.readLine();
            if ("Insert".equals(consult)) {
                String[] query = br.readLine().trim().split("\\s+");
                nums.add(Integer.parseInt(query[0]), Integer.parseInt(query[1]));
                System.out.println(nums);
            }
            if ("Delete".equals(consult)) {
                nums.remove(Integer.parseInt(br.readLine()));
                System.out.println(nums);
            }
            test--;
        }
        StringBuilder output = new StringBuilder();
        nums.forEach(num -> output.append(num).append(" "));

        System.out.println(output);


    }
}
