package differentTypeOfOverloading;

public class ProblemSolution {

    public static void main(String[] args) {
        int [] a ={1,2,3,5,6,7,9,10};

        for (int x = 1; x < a.length; x++) {

            if(x !=a[x-1]){

                System.out.println(x);
               break;
                //continue;
            }

        }

    }
}


