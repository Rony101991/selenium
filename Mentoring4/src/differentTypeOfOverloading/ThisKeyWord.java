package differentTypeOfOverloading;

public class ThisKeyWord {

    int a;
    int b;
    void getsomething(int a, int b){
        this.a=a;
        this.b=b;
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ThisKeyWord x=new ThisKeyWord();
        x.getsomething(10,20);
        x.print();
    }
}
