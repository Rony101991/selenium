package mentoring3;

public class Occurance {
    public static void main(String[] args) {
        String s="we love Bangladesh from our heart";

        int t=s.length();//t=33

        System.out.println(t);//33

        int E=s.replace("e","").length();//subE=29
        System.out.println(E);//29

        int totalE= t-E;//33-29
        System.out.println(totalE);//4
    }
}
