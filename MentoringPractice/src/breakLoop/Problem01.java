package breakLoop;



import java.util.*;

    public class Problem01 {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList( 1,2,2,3,3,3,3,4,4,4,44,55,5,5,5,5,5,6);
            ArrayList<Integer> number = new ArrayList<Integer>();
            number.addAll(numbers);
            Set<Integer> set = new HashSet<Integer>(number);
            System.out.println(set);
        }
    }


