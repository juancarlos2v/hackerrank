package JavaPreparation;

import java.util.*;

public class JavaMap {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phonebook = new HashMap<>();
        List<String> result = new ArrayList<>();

        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phonebook.put(name, phone);
            in.nextLine();
        }
        //System.out.println(phonebook);

        while (in.hasNext()) {
            String query = in.nextLine();

            for (String key : phonebook.keySet()) {
                if (key.equals(query)) {
                    //System.out.println( key + "=" + phonebook.get(query));
                    result.add(key + "=" + phonebook.get(query));
                } else {
                    System.out.println("Not Found");
                }
            }
        }
        for (String r:result
             ) {
            System.out.println(r);
        }


    }

}
