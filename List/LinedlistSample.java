package List;

import java.util.*;

public class LinedlistSample {
     public static void main(String[] args) {
        LinkedList list=new LinkedList();
        LinkedList listone=new LinkedList();
        list.add(2023);
        list.add(1.23);
        list.add(true);
        list.add("Wick");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator  obj=list.iterator();
        while (obj.hasNext()) {
            System.out.println(obj.next());
        }
      listone.add(1,2 );
      

    }
}
