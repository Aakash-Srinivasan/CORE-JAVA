package Practiceone;
import java.util.*;
import java.util.Collections;
public class pra_one {
    public static void Display(){
        LinkedList lili=new LinkedList();
        lili.add(true);
        lili.add(5);
        lili.add(9);
        lili.add("PRACTICE");
        lili.add(100);
        for(int i=0;i<lili.size();i++){
            System.out.println("Posititon of "+i+" element is "+lili.get(i));
        }
    }
    public static void removeFirstLast(){
        System.out.println("*******************************************************");
        LinkedList lili=new LinkedList();
        lili.add(true);
        lili.add(5);
        lili.add(9);
        lili.add("PRACTICE");
        lili.add(100);
        System.out.println("Before remove : "+lili);
        lili.removeFirst();
        lili.removeLast();
        System.out.println("After remove : " + lili);

    }
    public static void convert(){
        System.out.println("*******************************************************");
        LinkedList lili=new LinkedList();
        lili.add(true);
        lili.add(5);
        lili.add(9);
        lili.add("PRACTICE");
        lili.add(100);
        ArrayList li=new ArrayList(lili);
        System.out.println("Array List :"+li);
        if(li.size()%2==0){
             System.out.println("Your Array list Size is Even so can't find Middle value");
        }
        else{
           int j=li.size()/2;
        System.out.println("Middle element :"+li.get(j));
        }
    }
    public static void find(){
        System.out.println("*************************************************");
        ArrayList Ar=new ArrayList();
        Scanner obj=new Scanner(System.in);
        Ar.add(1);
        Ar.add(2);
        Ar.add(4);
        Ar.add(6);
        Ar.add(5);
        Ar.sort(null);
        System.out.println(Ar);
        System.out.println("Enter the search element :");
        int j= obj.nextInt();
        for(int i=0;i<Ar.size();i++){
            int k=(int) Ar.get(i);
            if(k==j){
                 System.out.println("This element of "+j+" is in the Array list index of "+i);
                 break;
            }
        }
        
    }
    public static void lessthanseven(){
        TreeSet<Integer> ar=new TreeSet();
        ar.add(1);
        ar.add(1);
        ar.add(9);
        ar.add(10);
        ar.add(8);
        ar.add(2);
        ar.add(3);
        ar.add(6);
        ar.add(5);
        System.out.println(ar);
        for(Integer obj:ar){
            if(obj<7){
                System.out.print(obj);

            }
        }
    }
    public static void First(){
        TreeSet <String>arr=new TreeSet();
        arr.add("Apple");
        arr.add("banaana");
        arr.add("juice");
        arr.add("jam");
        System.out.println(arr);
        System.out.println(arr.first());
        String FirstWord=arr.first();
        System.out.println(arr.last());
        String Lastword=arr.last();
        String joinword=FirstWord+Lastword;
        System.out.println(joinword);
        
        
    }
    public static void que(){
        PriorityQueue qone=new PriorityQueue();
        qone.add(1);
        qone.add(4);
        qone.add(2);
        qone.add(5);
        qone.add(3);
        qone.add(6);
        System.out.println(qone);
    }
    public static void duplicates(){
        ArrayList<Integer> Ar=new ArrayList<>();
        Ar.add(1);
        Ar.add(2);
        Ar.add(4);
        Ar.add(1);
        Ar.add(5);
        System.out.println(Ar);
        HashSet <Integer>Arr=new HashSet<>(Ar);
        ArrayList<Integer>Aj=new ArrayList<>(Arr);
        System.out.println(Aj);
    }
    public static void shuffle(){
        LinkedList lili=new LinkedList();
        lili.add(true);
        lili.add(5);
        lili.add(9);
        lili.add("PRACTICE");
        lili.add(100);
        Collections.shuffle(lili);
        System.out.println(lili);
    }
    
    public static void main(String[] args) {
    Display();
    removeFirstLast();
    convert();
    find();
    lessthanseven();
    First();
    que();
    duplicates();
    shuffle();
    }
}