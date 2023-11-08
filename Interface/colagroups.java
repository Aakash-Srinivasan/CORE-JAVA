package Interface;
 interface SoftDrinks {
    public void sprite(int a,int b,int c);
    public void cocacola(int a,int b,int c);
}

    interface waterPackaging {
    public void kinelyProduction(int a,int b,int c);
    }
public class colagroups implements SoftDrinks,waterPackaging{

    @Override
    public void kinelyProduction(int a,int b,int c) {
        System.out.println("**KINELY**");
        System.out.println("Number of unit Manufacturing in Year ="+a+"per production");
        System.out.println("Package of single unit  in Year ="+b+"per unit");
        System.out.println("Manufacturing cost in Year ="+c+"Lakhs");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

    }

    @Override
    public void sprite(int a,int b,int c) {
        System.out.println("**SPRITE**");
        System.out.println("Number of unit Manufacturing in Year ="+a+"per production");
        System.out.println("Package of single unit  in Year ="+b+"per unit");
        System.out.println("Manufacturing cost in Year ="+c+"Lakhs");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    
    }

    @Override
    public void cocacola(int a,int b,int c) {
        System.out.println("**COCACOLA**");
        System.out.println("Number of unit Manufacturing in Year ="+a+"per production");
        System.out.println("Package of single unit  in Year ="+b+"per unit");
        System.out.println("Manufacturing cost in Year ="+c+"Lakhs");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        
    }
    public static void main(String[] args) {
        colagroups a=new colagroups();
        a.cocacola(150,85,50);
        a.sprite(100,50,89);
        a.kinelyProduction(200,100,100);
    }
}

