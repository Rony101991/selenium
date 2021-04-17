package differentTypeOfOverloading;

class x
{
    public void sk(){
        System.out.println(" Just to Check SK is print out or not");
    }
}

class y extends x
{
    public void sk(){
        super.sk();
        System.out.println("Just to Check result from class y comes or not");
    }
}


public class Overriding {
    public static void main(String[] args) {


        y rfe = new y();
        //  x rex=new x();
        rfe.sk();

    }
}
