package breakLoop;

public class ForLoop {
    public static void main(String[] args) {

        for(int x=1; x<10; x++){
            if(x==6){
                break;
            }
            System.out.println(x);
        }
    }
}
