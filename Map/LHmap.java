package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LHmap {
    public static void main(String[] args) {
        LinkedHashMap  hm=new LinkedHashMap();
        LinkedHashMap  hmone=new LinkedHashMap();
        hm.put(1, "Wipro");
        hm.put(2, "CTS");
        hm.put(5, "TCS");
        hm.put(null, null);
        hm.put(null, null);
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
        System.out.println(hm);
        System.out.println(hmone);
    }
    
}
