package forLoops;

public class AccessModifier2 {
    public static void main(String[] args) {
j();
AccessModifier2 g= new AccessModifier2();
g.stop();// int a=10;
        //System.out.println(a);
g.ab();
g.cb();
    }
    void ab(){
        System.out.println("Able to access with object creation");
    }
    public void cb(){
        System.out.println("Open to access all by creating object in different class");
    }
    private void stop(){
        System.out.println("Only able to access same class");
    }
    static void j(){
        System.out.println("Able access same class without any object creation");
    }
}
