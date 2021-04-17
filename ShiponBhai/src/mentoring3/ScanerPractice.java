package mentoring3;


import java.util.Scanner;

public class ScanerPractice {
    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);

       // System.out.println("My name, my age ,my salary");
        String name=x.nextLine();
        int age = x.nextInt();
        double salary = x.nextInt();

        System.out.println("name : "+name+"\n my age:"+age+"\n my salary : "+salary);
        //System.out.println("name : "+name);

        //System.out.println("age: "+age);
        //System.out.println("salary : "+ salary);



    }
}
