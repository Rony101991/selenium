package midTerm1;

import java.util.ArrayList;

public class Practice121 {
    public static void main(String[] args) {
        System.out.println(findprimes(1,200));// n=start,end

    }
    public static ArrayList<Integer> findprimes(int start, int end)//Method Created
    {
        ArrayList<Integer>primes=new ArrayList<Integer>();
        for(int n= start; n<end;n++)//nested forloop
        {
            boolean prime=true;//false
            int i=2;
            while(i<=n/2){
                if(n%i==0){
                    prime=false;
                    break;
                }
                i++;
            }
            if(prime){
                primes.add(n);
            }
        }
        return primes;
    }
}
