package breakLoop;

public class NewBreakPractice {
    public static void main(String[] args) {


        for (int x = 1; x <= 10; x++) {
            if (x == 3) {
                break;
            }
            System.out.println(x);
        }
    }
}