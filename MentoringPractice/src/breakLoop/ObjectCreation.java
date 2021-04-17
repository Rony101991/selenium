package breakLoop;

public class ObjectCreation {
    public static void main(String[] args) {
        //ObjectCreation c=new ObjectCreation();
        //c.stop();
        //may();

    }

    void display(){
        System.out.println("just check");
    }//duplicat or default
    public void run(){
        System.out.println("Open to All");
    }
    private void stop(){
        System.out.println("No one can access it");
    }
    static void may(){
        System.out.println("May run in same class");
    }
}
