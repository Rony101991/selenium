package methodOverloading;

class Ti84
{
    public void add(int x,int y)
    {
        System.out.println(x+y);
    }
}
class Ti84Adv extends Ti84
{
    public void sub(int x, int y){
        System.out.println(x-y);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Ti84 rfe =new Ti84();
        Ti84Adv rfee=new Ti84Adv();
        rfe.add(9,10);
        rfee.sub(15,5);
    }
}
