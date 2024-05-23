package JavaPreparation;


import java.util.*;

class Stud {
    private int id;
    private String fname;
    private double cgpa;

    public Stud(int id, String fname, double cgpa){
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

}

public class JavaSortObject {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       // int testCases = Integer.parseInt(in.nextLine());

        List<Stud> studentList = new ArrayList<>();
        studentList.add(new Stud(33, "Rumpa", 3.68));
        studentList.add(new Stud(85, "Ashis", 3.85));
        studentList.add(new Stud(56 ,"Samiha", 3.75));
        studentList.add(new Stud(19 ,"Samara", 3.75));
        studentList.add(new Stud(22, "Fahim" ,3.76));


        /**while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }**/
        Comparator<Stud> comparator = Comparator
                .comparing(Stud::getCgpa, Comparator.reverseOrder())
                .thenComparing(Stud::getFname)
                .thenComparing(Stud::getId);

        studentList.sort(comparator);

        for(Stud st: studentList){
            System.out.println(st.getFname());
        }
    }
}
