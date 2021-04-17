public class PublicClass {
    public static void main(String[]args){
        int year;
        year=2501;
                if(year%4==0){
                    System.out.println("leap year");
                }
    else if(year%100==0&&year%400!=0){
                    System.out.println("leap year");}
    else{
                    System.out.println("not leap year");
                }
    }
}
