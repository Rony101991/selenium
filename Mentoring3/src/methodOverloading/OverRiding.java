package methodOverloading;

class A {
    public void Check() {
        System.out.println("Result from A");
    }}

    class B extends A {

        public void Check() {
            super.Check();
            System.out.println("Result from Class B");
        }
    }


    public class OverRiding {
        public static void main(String[] args) {
            B rfe = new B();
            rfe.Check();
        }
    }
