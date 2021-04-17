package mentoring3;
class Ti84
{
    public void add(int x, int y)
    {
        System.out.println(x+y);
    }
}


class Ti84Advance extends Ti84
{
    public void sub(int x, int y)
    {
        System.out.println(x-y);
    }
}


public class inheritance {
    public static void main(String[] args) {
        Ti84 c=new Ti84();
        Ti84Advance c1=new Ti84Advance();
                c.add(3,4);
                c1.sub(7,2);
    }
}
