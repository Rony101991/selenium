package differentTypeOfOverloading;

public class ConstructorOverLoading {

    ConstructorOverLoading(int a,int b){
        System.out.println(a+b);
    }
    ConstructorOverLoading(double c, int d){
        System.out.println(c-d);
    }

    public static void main(String[] args) {


        ConstructorOverLoading y=new ConstructorOverLoading(10.5,5);

    }
}
