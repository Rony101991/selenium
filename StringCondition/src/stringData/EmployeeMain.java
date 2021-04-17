package stringData;

public class EmployeeMain {
    public static void main(String[]args){

        Employee emp1 = new Employee();
        emp1.id = 101;
        emp1.eName = "Alimur";
        emp1.sal =2022502;
        emp1.dNum =10;
        emp1.job ="Marketing";
        emp1.display();

        Employee emp2 = new Employee();
        emp2.id = 102;
        emp2.eName = "Sk";
        emp2.sal =20232;
        emp2.dNum =11;
        emp2.job ="Sales";
        emp2.display();
        System.out.println();




    }
}
