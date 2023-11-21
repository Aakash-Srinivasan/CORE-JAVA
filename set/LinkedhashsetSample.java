package set;

import java.util.*;

public class LinkedhashsetSample {
    public static void main(String[] args) {
     LinkedHashSet ar=new LinkedHashSet();
        ar.add(1);
        ar.add(1);
        ar.add(9);
        ar.add(10);
        ar.add(8);
        ar.add(2);
        ar.add(3);
        ar.add(6);
        ar.add(5);
        Iterator  obj=ar.iterator();
        while (obj.hasNext()) {
            System.out.println(obj.next());
        }
    }
}
