package forLoops;

public class ArrayForLoops {
    public static void main(String[] args) {
        String x[]={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday",
                "Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"
                ,"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"
                ,"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        for(int a=0;a<=x.length;a++){
            if(x[a]=="Tuesday"){
                break;
            }
            System.out.println(x[a]);
        }
    }
}
