package Interface;
 interface Areasofobject {
    public void circle(int r);
    public void rectangle(int l,int w); 
    public void  triangle(int b ,int h);
}
public class Areas implements Areasofobject {

    @Override
    public void circle(int r) {
        float pi=(float) 3.14159;
        int area=(int) (pi*r*r);
         System.out.println("Area of rectangle : "+area+"m");

    }

    @Override
    public void rectangle(int l, int w) {
        int area=w*l;
        System.out.println("Area of rectangle : "+area+"m");
    }

    @Override
    public void triangle(int b, int h) {
      int area=(b*h)/2;
      System.out.println("Area of triangle : "+area+"m");
    }
    
 public static void main(String[] args) {
    Areas a=new Areas();
    a.circle(3);
    a.rectangle(2, 5);
    a.triangle(7, 5);
 }

    
}