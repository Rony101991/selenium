package differentTypeOfOverloading;

interface a{
    int h=20;
    int g=30;
    void f();
}
interface b{
    int s=10;
    void c();
}
public class PracticeInterface implements a,b {
    @Override
    public void f() {
        System.out.println(h);
        System.out.println(g);
    }

    @Override
    public void c() {
        System.out.println(s);

    }

    public static void main(String[] args) {
        PracticeInterface r=new  PracticeInterface ();
        r.f();
        r.c();

    }
}
