package ProblemSolving;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

        List<Integer> arr= List.of(-4, 3, -9, 0, 4, 1);
        float positive=0;
        float negative=0;
        float zero=0;

        for(int a:arr){
            if(a>0)positive++;
            if(a==0)zero++;
            if(a<0)negative++;
        }

        System.out.println(String.format("%.6f",positive/arr.size()) );
        System.out.println(String.format("%.6f",negative/arr.size()) );
        System.out.println(String.format("%.6f",zero/arr.size()) );

    }
}
