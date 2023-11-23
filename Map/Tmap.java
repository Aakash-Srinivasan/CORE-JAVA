package Map;
import java.util.*;

public class Tmap {
     public static void main(String[] args) {
        TreeMap  hm=new TreeMap();
        TreeMap  hmone=new TreeMap();
        hm.put(1, "Wipro");
        hm.put(2, "CTS");
        hm.put(5, "TCS");
        System.out.println(hm);
        hmone.put(4, "Infosis");
        hmone.put(3, "Zoho");
        hmone.putAll(hm);
        System.out.println(hmone);
        System.out.println(hmone.get(4));
        hmone.remove(2);
        hmone.replace(3, "TCS", "Tcs");
        System.out.println(hmone.containsKey(2));
        System.out.println(hmone.containsValue("Zoho"));
        //hmone.clear();
        Set set=hmone.entrySet();
       Iterator itr=set.iterator();
       while (itr.hasNext()) {
       System.out.println(itr.next());
        
       }
    }
    
}
