package mentoring3;
class X
{
    public void check(){

        System.out.println("Result comes from Class X");
    }
}
class Y extends X
{
    public void check(){
        super.check();
        System.out.println("Result comes from Y.");
    }
}
 class z extends Y {
    public void check() {
        super.check();
        System.out.println("Check z work or not");
    }
}

public class Overriding {
    public static void main(String[] args) {
       // Y rfe =new Y();
        z ref=new z();
        //rfe.check();
        ref.check();
    }
}
