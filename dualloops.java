public class dualloops {
    public static void asc() {
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
        System.out.println("***********************************************************");
        
    }
    public static void desc(){
        int a[]={5,6,7,1,2,4,3};
        for(int i=0;i<a.length;i++){
            int temp=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
        System.out.println("***********************************************************");
    }
    public static void mix(){
        int a[]={5,6,7,1,2,4,3,8};
         for(int i=0;i<a.length/2;i++){
            int temp=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i = 0; i < a.length / 2; i++) 
        {
            System.out.print(a[i] + " ");
        }
        for (int j = a.length - 1; j >= a.length / 2; j--)
        {
            System.out.print(a[j] + " ");
        }
          System.out.println("***********************************************************"); 
    }

    public static void secondlargest(){
        int a[]={5,6,7,1,2,4,3};
        int secondlargest=a.length-2;
        for(int i=0;i<a.length;i++){
            int temp=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(a[secondlargest]);
        System.out.println("***********************************************************");
    }
    
    public static void secondsmallest(){
        int a[]={5,6,7,1,2,4,3};
        int secondsmallest=a.length-2;
        for(int i=0;i<a.length;i++){
            int temp=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(a[secondsmallest]);
        System.out.println("***********************************************************");
    }
    public static void main(String[] args) {
       //asc();
       //desc();
       //mix();
       //secondlargest();
       //secondsmallest();

    }
    
}
