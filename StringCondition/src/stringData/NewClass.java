package stringData;

public class NewClass {
    public static void main(String[] args) {
        String s ="Welcome  ";
        String s1 ="      Rezaul loves America     ";

        //length..............

        System.out.println(s.length());
        System.out.println(s.concat(s1));


        s=" Welcome";
        System.out.println(s.charAt(2));
       // Equals
        s="Shovo";
        System.out.println(s.equals("Shovo"));
        System.out.println(s.equals("shovo"));
        System.out.println(s.equals("Sho  vo"));
       // Triming
        s="Rezaul";
        System.out.println(s.trim());
        //Contains
        s="Trump";
        System.out.println(s.contains("Tru"));
        //Subtring
        s="Welcome";
        System.out.println(s.substring(0,2));


    }
}
