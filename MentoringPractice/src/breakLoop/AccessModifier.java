package breakLoop;

public class AccessModifier {
    public static void main(String[] args) {

        AccessModifier c=new AccessModifier();//constractor
        //c.stop();
        may();

    }




    void display(){
        System.out.println("Cheek 1");
    }
    public void run(){
        System.out.println("Run for All");
    }
    private void stop(){
        System.out.println("Only access same class");
    }
    static void may(){
        System.out.println("May run in a same class without constractor");
    }
}
