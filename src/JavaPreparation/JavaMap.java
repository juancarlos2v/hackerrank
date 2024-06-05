package JavaPreparation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class JavaMap {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> phonebook = new HashMap<>();

        int contacts = Integer.parseInt(br.readLine());

        for (int i = 0; i < contacts; i++) {
            String name = br.readLine();
            int phone = Integer.parseInt(br.readLine());
            phonebook.put(name, phone);
        }

        while (true) {
            String query = br.readLine();
            if (query == null || query.isEmpty()) {
                break;
            }
            if (phonebook.containsKey(query)) {
                System.out.println(query + "=" + phonebook.get(query));
            } else {
                System.out.println("Not Found");
            }

        }
    }

}
