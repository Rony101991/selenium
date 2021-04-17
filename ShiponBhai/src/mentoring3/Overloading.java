package mentoring3;

class Mex
{
    public void add(int x,int y){
        System.out.println(x+y);
    }
    public void add(int x,int y,int z){
        System.out.println(x+y+z);
    }
    public void add(String a,int c,double d){
        System.out.println(a+c+d);
    }
}


public class Overloading {
    public static void main(String[] args) {
        Mex obj=new Mex();
        obj.add(2,3);
        obj.add(2,3,4);
        obj.add("Alimur",  10,  5.5);
    }
}
