import java.util.Arrays;

public class five {
    public static void PositiveNegative() {
        int a[]={-1,1,7,-11,-8,-9};
        int b[]=new int[a.length];
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                b[i]=a[i];
            }
            else{
                c[i]=a[i];
            }
        }
        System.out.print(" Positive Number: ");
        for(int i=0;i<b.length;i++){
            if(b[i]!=0){
            System.out.print(" ");
            System.out.print(b[i]);
            }
        }
        System.out.println("");
        System.out.print(" Negative number: " );
         for(int i=0;i<c.length;i++){
            if(c[i]!=0){
            System.out.print(c[i]);
            System.out.print(" ");
            } 
        }
        System.out.println("");
        System.out.println("*********************************************************");
    }
    public static void duplicates() {
       int a[]={-1,1,1,17,17,-11,-8,-9};
       System.out.print(" Dupilicates values are :" );
        for(int i=0;i<a.length;i++){
             for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.print(" "+ a[i]+",");
                }
            }
        }
        System.out.println("");
        System.out.println("*********************************************************");
    }
    public static void swap() {
        int a[]={5,6,7,1,2,3};
        int swapnum1=7;
        int swapnum2=3;
        for(int i=0;i<a.length;i++){
            {
                if(swapnum1==a[i])
                {
                    a[i]= swapnum2;
                }
                else if(swapnum2==a[i]){
                    a[i]=swapnum1;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
        System.out.println("*********************************************************");
    }
    public static void bubblesort() {
        int a[]={5,6,7,1,2,3};
        for(int i=0;i<a.length;i++){
            int temp=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
        System.out.println("*********************************************************");
    }
    
    public static void main(String[] args) {
       PositiveNegative();
       duplicates();
       bubblesort();
       swap();
    }
    
}
