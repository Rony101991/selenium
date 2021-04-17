import java.util.stream.Collectors;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class DuplicateNumberRemove {

        public static void main(String[] args)
        {
            List<Integer> list = new ArrayList<>(
                    Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

            System.out.println("All the given numbers " + list);

            List<Integer> newList = list.stream()
                    .distinct()
                    .collect(Collectors.toList());
            //  .collect(Collectors.toList());


            System.out.println("Tall the result : "
                    + newList);
        }



    }


