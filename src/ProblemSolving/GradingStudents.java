package ProblemSolving;

import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = List.of(73,67,38,33);

        for (Integer grade:grades
             ) {
            System.out.println(grade+grade%5);
        }
    }
}
