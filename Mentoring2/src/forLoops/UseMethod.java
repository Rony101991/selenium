package forLoops;

public class UseMethod {
    public static void main(String[] args) {
        UseMethod y =new UseMethod();

        WriteMethod x = new WriteMethod();


        x.b();
        x.c();
        y.k();
        y.shahin();
        x.a();
    }

    void k(){
        System.out.println("check k is working in the same class");
    }
    void shahin(){
        System.out.println("Just to clear the idea");
    }
}
