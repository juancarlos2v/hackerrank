package ProblemSolving;

public class Staircase {
    public static void main(String[] args) {

        int n=6;
        StringBuilder space = new StringBuilder();
        space.append(" ".repeat(n));
        String a= "";

        for (int i = 0; i <n && space.length() > 0; i++) {
            space = new StringBuilder(space.substring(0, space.length() - 1));
            a+="#";
            System.out.print(space);System.out.println(a);

        }
    }
}
