package methodOverloading;

class Mex
{
    public void add(int x, int y){
        System.out.println(x+y);
    }
    public void add(int x,int y, int z){
        System.out.println(x+y+z);
    }
    public void add(String v,int x){
        System.out.println(v+x);
    }
}




public class OverLoding {
    public static void main(String[] args) {

        Mex rfe= new Mex();
        //rfe.add(7,8);
        rfe.add(9,5,3);
        rfe.add("Alimur",7);
    }
}
