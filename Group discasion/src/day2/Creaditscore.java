package day2;

public class Creaditscore {
    public static void main(String[] args) {
        int creditValue=692;
        if(creditValue>=300 && creditValue<=579){
            System.out.println("Your Credit Score is poor");
        }else if(creditValue>=580 && creditValue<=669){
            System.out.println("Your Credit Score is fair");
        }else if(creditValue>=670 && creditValue<=739){
            System.out.println("your credit score is good");
        }else if(creditValue>=740 && creditValue<=799){
            System.out.println("you have very good credit score");
        }else if(creditValue>=800 && creditValue<=850){
            System.out.println("you have excelent credit score");
        }else{
            System.out.println("please enter valid credit value");
        }
    }
}
