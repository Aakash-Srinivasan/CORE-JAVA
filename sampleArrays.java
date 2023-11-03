import java.util.Arrays;

public class sampleArrays {
    public static void main(String[] args) {
        int A[]={8,2,6,7,3,1,9,10,4,5};
        int B[]={8,2,6,7,3,1,9,10,4,5};
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);

        }
        System.out.println("###########################################");
        int b=Arrays.binarySearch(A,9);
        System.out.println("index "+b);
        // hashcode
        System.out.println("###########################################");
        int c=Arrays.hashCode(A);
        System.err.println(c);
        //fill method
        System.out.println("###########################################");
        Arrays.fill(A,12);
         for(int i=0;i<A.length;i++){
          //  System.out.print(A[i]);

        }
        System.out.println("###########################################");
        //equals
       System.out.println( Arrays.equals(A,B));
       System.out.println("###########################################");
       //tostring
       System.out.println(Arrays.toString(A)+"hai");
       
    }
    
}
