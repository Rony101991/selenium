package mentoring3;

public class SmallestLargest {
    public static void main(String[] args) {
       // int []arr={10,-101,20,50,100,0,14,19};
        int[]brr={10,20,30,60,80};
        int min=brr[0];

        int max=brr[0];

        for(int x=0; x< brr.length; x++){
            if(brr[x]<min){
                min=brr[x];
            }
            if(brr[x]>max){
                max=brr[x];
            }

        }
        System.out.println("smallest "+min);
        System.out.println("largest "+max);
    }
}
