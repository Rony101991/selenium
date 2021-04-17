package mentoring3;

public class Char {
    public static void main(String[] args) {
        String d="We love Hasina";

        int c=0;

        System.out.println(d.length());

        for(int x=0; x<d.length(); x++){
            if(d.charAt(x)!=' '){
                c++;
            }

        }
        System.out.println(c);

    }
}
