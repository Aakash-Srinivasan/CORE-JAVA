package List;

import java.util.*;

public class ArrayListSample {
    public static void cls() {
        ArrayList list=new ArrayList();
        ArrayList <String>li=new ArrayList<String>();
        li.add("2023");
        li.add("Aakash");
        li.add("vertical");
        li.add("solution");
        list.add(2023);
        list.add(1.23);
        list.add(true);
        list.add("Wick");
        System.out.println(list); 
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator  obj=list.iterator();
        while (obj.hasNext()) {
            System.out.println(obj.next());
        }
        for (String i:li){
            System.out.println(i);
        }

    }
    public static void reverse (){
        List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  System.out.println("List before reversing :\n" + list_Strings);
  System.out.println("List before reversing :" );
  for(int i=list_Strings.size()-1;i>0;i--){
    System.out.println(list_Strings.get(i));
  }
        
    }
    public static void main(String[] args) {
        reverse();
        cls();
    }
    
}
