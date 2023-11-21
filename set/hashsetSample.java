package set;
import java.util.*;

public class hashsetSample {
    public static void main(String[] args) {
        HashSet ar=new HashSet();
        HashSet aj=new HashSet();
        ar.add(1);
        ar.add(1);
        ar.add(9);
        ar.add(10);
        ar.add(8);
        ar.add(2);
        ar.add(3);
        ar.add(6);
        ar.add(5);
        //ar.getClass();
       // ar.clear();
       aj.clone();
       System.out.println();
       ar.size();
        for(Object obj:ar){
            System.out.println(obj);
        }
        System.out.println(ar);
    }
    
}
