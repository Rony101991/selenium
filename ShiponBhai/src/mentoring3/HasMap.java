package mentoring3;

import java.util.HashMap;

public class HasMap {
    public static void main(String[] args) {
        HashMap<String,String> userPass=new HashMap<String, String>();
        userPass.put("user","121");
        userPass.put("user1","21221");
        userPass.put("user2","3202");
        for (String s: userPass.values()
             ) {
            System.out.println(s);
            
        }
    }

}
