package differentTypeOfOverloading;

public class MethodOverLoading2 {
    void x(int a,int b){
        System.out.println(a-b);
    }
    void x (int a, double c){
        System.out.println(a*c);
    }
    void x(int d,double e,double f){
        System.out.println(d+e-f);
    }

    public static void main(String[] args) {
        MethodOverLoading2 y = new MethodOverLoading2();
        y.x(20,10);
        y.x(10,15.5);
        y.x(30,5,20);
    }

}
