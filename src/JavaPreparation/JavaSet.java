package JavaPreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class JavaSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());
        Set<String> name = new HashSet<>();

        while (test > 0) {
            name.add(br.readLine());
            System.out.println(name.size());
            test--;
        }
        br.close();
    }
}
