package differentTypeOfOverloading;

public class Overloading {
    void x(int a, int b){
        System.out.println(a+b);
    }
    void x(int b, int a, String t){
        System.out.println(b+a+t);
    }
    void x(int b, int d, int c){
        System.out.println(b+d-c);
    }

    public static void main(String[] args) {
        Overloading k =new Overloading();
        k.x(5,6);
        k.x(6,3,2);
        k.x(6,5,"Afm");
    }
}
