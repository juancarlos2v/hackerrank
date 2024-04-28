package ProblemSolving;

public class TimeConversion {
    public static void main(String[] args) {
        String s="09:05:45PM";
        int hour= Integer.parseInt(s.substring(0,2));
        String substring = s.substring(0, s.length() - 2);
        if(s.contains("P")){

            if(hour==12){
                System.out.println(substring);
            }else{
                hour=12+hour;
                System.out.println(hour+ substring.substring(2));
            }
        }else{
            if(hour==12){
                System.out.println("00"+substring.substring(2));
            }else {
                System.out.println(substring);
            }

        }

    }
}
