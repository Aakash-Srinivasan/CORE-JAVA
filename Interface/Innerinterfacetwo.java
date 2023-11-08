package Interface;

 interface Progress {
    public void obstract();
    static final int a=10;
}

    interface automation {
    public void calculation();
    }
/**
 * Innerinterfacetwo
 */
public class Innerinterfacetwo implements automation,Progress{
 public void calculation(){
    int annual=400000;
    int diwalibonus=20000;
    int tax=10;
    int salary=annual+diwalibonus-tax;
    System.out.println(salary);
 }

 @Override
    public void obstract() {
         int age=20;
         String name="Aakash";
         int salary=1000;
         System.out.println(age+" "+name+" "+salary);
    }

   
public static void main(String[] args) {
    Innerinterfacetwo a=new Innerinterfacetwo();
    a.obstract();
    a.calculation();


}

    
}
