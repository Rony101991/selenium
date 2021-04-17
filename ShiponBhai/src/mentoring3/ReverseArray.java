package mentoring3;

public class ReverseArray {
    public static void main(String[] args) {
        int a []={1,2,7,9,89,10000};

        for(int x=a.length-1; x>=0;x--){
            System.out.println(a[x]);
        }
       /* for(int x=0;x<a.length;x++){
            System.out.println(a[x]);
        }*/
    }
}
