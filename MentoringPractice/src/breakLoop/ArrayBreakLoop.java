package breakLoop;

public class ArrayBreakLoop {
    public static void main(String[] args) {
        String a[]={"Monday","Tuesday","wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","wednesday",
                "Thursday","Friday","Saturday","Sunday","Monday","Tuesday","wednesday","Thursday","Friday",
                "Saturday","Sunday"};
        for(int x=0;x<=a.length;x++){
            if(a[x]=="Saturday"){
                break;
            }
            System.out.println(a[x]);
        }

    }
}
