package differentTypeOfOverloading;

import java.util.Scanner;

public class NewScannerPractice {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);

        String name = x.nextLine();
        int age = x.nextInt();
        int dob= x.nextInt();
        System.out.println("My name,My age,dob");
    }
}
