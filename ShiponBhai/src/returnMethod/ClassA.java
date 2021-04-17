package returnMethod;

interface x
{
    int n =25;
    int v=20;
     void k();//This is abstract method.Where we will not have any parameter or print.
}
interface y{
    int l=15;
    void m();
}
public class ClassA implements x,y {
    @Override
     public void k() {
        System.out.println(v);
        System.out.println(n);
        System.out.println("just to check how it work");
    }

    public void m (){
        System.out.println(l);

    }
    public static void main(String[] args) {
        y p=new ClassA();
        p.m();
        x j=new ClassA();
        j.k();
    }

}
