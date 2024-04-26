package ProblemSolving;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {

        List<Integer> a=List.of(17, 28, 30);
        List<Integer> b=List.of(99, 16, 8);
        Integer [] points=new Integer[]{0,0};

        for (int i=0;i<3;i++){
            if(a.get(i) >b.get(i)){
                 points[0]++;
             }if(a.get(i)<b.get(i)){
                points[1]++;
             }
        }
        List<Integer> l=Arrays.asList(points);

        System.out.println(l);
        System.out.println(points[0]+" "+points[1]);
    }
}
