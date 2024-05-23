package JavaPreparation;

import java.util.ArrayList;
import java.util.List;

public class JavaGeneric {

    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3);
        List<String> str = List.of("Hello","World");
        genericList(num);
        genericList(str);
    }

    public static void genericList(List<?> list) {
        for (Object a : list) {
            System.out.println(a);
        }
    }

}
