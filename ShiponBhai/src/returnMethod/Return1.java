package returnMethod;

public class Return1 {

        public static void main(String[] args) {
            Return1 rm = new Return1();


            int sum = rm.number1() * number2() ;

            System.out.println(sum);

            String x = rm.stateName();
            System.out.println(rm.stateName());
            System.out.println(x);
        }

        int number1() {
            int  a = 2;
            return a;
        }

        static int number2(){
            int b = 5;
            return b;
        }

        String stateName(){
            String stateFirstPart = "New";
            String stateLastPart = "Jersey";
            String name = stateFirstPart + stateLastPart;
            return name;
        }
    }


