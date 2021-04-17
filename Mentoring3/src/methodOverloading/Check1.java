package methodOverloading;
interface x
{
    int t=10;
    int h=15;
    void k();//This is abstrack method.Where does not have parameter or comments
}
interface y
{
    int c=20;
    void l();
}


public class Check1 implements x,y {
    @Override
    public void k()
    {
        System.out.println(t);
        System.out.println(h);
    }
    public void l()
    {
        System.out.println(c);
    }

    public static void main(String[] args) {
        y rfe=new Check1();
        rfe.l();
        x rfee=new Check1();
        rfee.k();
    }
}
