package day2;

public class MakeANewClass {
    //n!=n*(n-1)*.....*1
    //5!=5*(5-1)*(5-2)*(5-3)*(5-4)=120
    public static void main(String[] args) {
        for (int i = 6; i <= 1000; i = i * (i - 1) * (i - 2) * (i - 3) * (i - 4) * (i - 5)) {

       //     for (int i = 6; i <= 10; i++) {
                System.out.println(i);


            }
        }
    }
