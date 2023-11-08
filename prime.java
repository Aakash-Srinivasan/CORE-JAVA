import java.util.Scanner;
public class prime {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n=Sc.nextInt();
        int [] data=new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0;i<data.length;i++){
            data[i]=Sc.nextInt();
        }
        for(int i=0;i<data.length;i++){
           // boolean isprime=true;
           int  count=0;
            for(int j=2;j<=data[i];j++){
                if(data[i]%j==0){
                   // isprime=false;
                   // break;
                   count++;
                }
            }
            if(count==1){
                System.out.println("The Prime number is:"+data[i]);
            }


            }
        }
    }
    
