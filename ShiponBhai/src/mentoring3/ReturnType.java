package mentoring3;

public class ReturnType {
    public static void main(String[] args) {
        x();
        y();
        //System.out.println("find result of y " +y());
    }

    public static void x() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public static double y() {
        int a = 30;  
        int b = 5;
        double d = a / b;
        System.out.println(d);
        return d;
    }
}


   /* public static void main(String[] args) {
        x();
        System.out.println("Result: " + y());
        // divided_two_number();
    }

    public static void x() {
        int num1 = 2, num2 = 20;
        int c = num1 * num2;
        System.out.println(c);
    }

    public static double y() {
        int num1 = 10, num2 = 5;
        double c = num1 / num2;
        return c;
    }*/

