package methodOverloading;


public class ConstructorOverLoading {

    ConstructorOverLoading(int x,int y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        ConstructorOverLoading t=new ConstructorOverLoading(10,20);
    }
}
