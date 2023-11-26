import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class TestFive {
    public static void one(){
        ArrayList ar=new ArrayList();
        ar.add(5);
        ar.add(6);
        ar.add(7);
        ar.add(8);
        System.out.println("Before swapping : "+ar);
        Collections.swap(ar, 1, 2);
        System.out.println("After swapping : "+ar);
    }
    public static void two(){
        LinkedList ar=new LinkedList<>();
        ar.add(5);
        ar.add(6);
        ar.add(7);
        ar.add(8);
        for(int i=0;i<ar.size();i++){
            System.out.println(i+")"+ar.get(i));
        }

    }
    public static void three() {
        LinkedList<Integer> al = new LinkedList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(0,0);
        al.add(al.size()-1,4);
        System.out.println("after adding :"+al);
        al.remove(1);
        al.remove(al.size()-2);
        System.out.println("After removing :"+al);


    }
    public static void four() {
        LinkedList<Integer> al = new LinkedList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);
        al.add(3);
        System.out.println("With duplicates:"+al);
        HashSet as=new HashSet(al);
        System.out.println("Without duplicates:"+as);
        
    }
    public static void five() {
        HashSet hsone = new HashSet();
        hsone.add(1);
        hsone.add(2);
        hsone.add(3);
        hsone.add(4);

        HashSet hsTwo = new HashSet();
        hsTwo.add(5);
        hsTwo.add(6);
        hsTwo.add(3);
        hsTwo.add(4);

        hsTwo.retainAll(hsone);
        System.out.println("Retained same elements : " + hsTwo);
        
    }
    public static void six() {
        TreeSet ts= new TreeSet<>();
        ts.add(6);
        ts.add(8);
        ts.add(9);
        System.out.println(ts);
        System.out.println("Enter the element :");
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        ts.remove(i);
        System.out.println(ts);
        
    }
    public static void seven() {
        PriorityQueue pq=new PriorityQueue();
        pq.add(1);
        pq.add(2); 
        pq.add(3);
        pq.add(4);
        System.out.println("Looping through : ");
        for (Object elements : pq) {
	       System.out.print(elements+" ");
        }
        System.out.println();

    }
    public static void eight() {
        PriorityQueue pq=new PriorityQueue();
        pq.add(1);
        pq.add(2); 
        pq.add(3);
        pq.add(4);
        System.out.println("Before remove :"+pq);
        pq.remove(1);
        System.out.println("After remove:" +pq);

        
    }
    public static void nine() {
        Map hm = new HashMap();
        Map hmone = new HashMap();
        hm.put(1, "ZOHO");
        hm.put(2, "TCS");
        hm.put(3, "CTS");
        hmone.putAll(hm);
        System.out.println("map:"+hm);
        System.out.println("copymap:"+hmone);

    }
        public static void ten() {
            Map<Integer, String> myMap = new HashMap<>();
            Map<Integer, String> MyMap = new HashMap<>();
            myMap.put(1, "thermo0meter");
            myMap.put(2, "Fluctu%ation");
            myMap.put(3, "eagl$e");
            myMap.put(4, "Pinpo#int");
            for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
                Integer key = entry.getKey();
                String originalValue = entry.getValue();
                String modifiedValue = originalValue.replaceAll("[&0$%#]", "");
                MyMap.put(key, modifiedValue);
            }
            System.out.println("Modified Map:"+MyMap);
        }
     public static void eleven() {
        HashSet<Integer> ts= new HashSet<Integer>();
        ts.add(6);
        ts.add(8);
        ts.add(9);
        System.out.println(ts);
        
    }
    public static void  tweleve() {
        String no = "1847254.412132131";
        double doubleValue = Double.parseDouble(no);
        int noTwo = (int) doubleValue;
        System.out.println("Converted - Int value : "+noTwo);
        
    }
    public static void thirtten() {
        File file = new File("C:\\Users\\user\\Downloads");
        String contents[] = file.list();
        for (int i = 0; i < contents.length; i++) {		
            System.out.println(contents[i]);
        }
        
    }
    public static void fourtineen() {
        File file = new File("C:\\Users\\user\\Documents\\file.txt");

        System.out.println(file.canRead());
        System.out.println(file.canWrite());
    }
    public static void fifteen() {
        ArrayList al = new ArrayList();
		al.add("Hai");
		al.add("Hello");
		al.add("Vanakam");
		List immutablelist = Collections.unmodifiableList(al);
		// Try to add an object.. exception is thrown
		immutablelist.add("Namaste");
		System.out.println("Unmodifiaable list : " + immutablelist);

	}  
    public static void main(String[] args) {
        one();
        System.out.println("******************************************************");
        two();
        System.out.println("******************************************************");
        three();
        System.out.println("******************************************************");
        four();
        System.out.println("******************************************************");
        five();
        System.out.println("******************************************************");
        //six();
        System.out.println("******************************************************");
        seven();
        System.out.println("******************************************************");
        eight();
        System.out.println("******************************************************");
        nine();
        System.out.println("******************************************************");
        ten();
        System.out.println("******************************************************");
        eleven();
        System.out.println("******************************************************");
        tweleve();
        System.out.println("******************************************************");
        thirtten();
        System.out.println("******************************************************");
        fourtineen();
        System.out.println("******************************************************");
        fifteen();
        
    }
}