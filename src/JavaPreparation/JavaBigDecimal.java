package JavaPreparation;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {
    public static void main(String[] args) {
        //List <String> arr= List.of("-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000");
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();

        List<Map.Entry<String,BigDecimal>> entry=new ArrayList<>();

        while(n>0){
            String d= scan.next();
            BigDecimal value = new BigDecimal(d);
            entry.add(new AbstractMap.SimpleEntry<>(d,value));
            n--;
        }
        System.out.println(entry);

       Collections.sort(entry,(e1,e2)->e2.getValue().compareTo(e1.getValue()));

        for (Map.Entry<String, BigDecimal> key:entry
             ) {
            System.out.println(key.getKey());
        }

    }

}
