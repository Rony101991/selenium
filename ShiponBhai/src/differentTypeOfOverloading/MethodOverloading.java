package differentTypeOfOverloading;

public class MethodOverloading {


    void add (int a,int b){
        System.out.println(a+b);//1
    }
    void add (int a, double b){
        System.out.println(a-b);//2
    }
    void add (double a, double b, int c){
        System.out.println(a+c+b);//3
    }

    public static void main(String[] args) {
        MethodOverloading x=new MethodOverloading();
        x.add(20,20);//1
        x.add(30,20);//2
        x.add(10,20,30);//3
        x.add(30,20);
    }
}
