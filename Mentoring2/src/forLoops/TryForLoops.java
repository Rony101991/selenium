package forLoops;

public class TryForLoops {
    public static void main(String[] args) {
        int i[]={1, 10, 2, 2, 10, 3, 3, 3, 4, 5, };

        for(int x=1;x<=10; x=x+2){
            if(x%2==0){
                continue;
            }
            System.out.println(x);
        }
    }
}
