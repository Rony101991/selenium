package differentTypeOfOverloading;

public class ThisKeyword {
    int a;
    int b;
    void getsomething(int a,int b){

      this.a=a;
        this.b=b;
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ThisKeyword c= new ThisKeyword();
        c.getsomething(10,20);
        c.print();


    }

}
