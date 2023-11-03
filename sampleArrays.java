import java.util.Arrays;
import java.util.Objects;

public class sampleArrays {
    /**
     * @param args
     */
    public static void arrayMethods() {
        int A[]={8,2,6,7,3,1,9,10,4,5};
        int B[]={8,2,6,12,3,1,11,10,4,5};
        // 1 sort 
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);

        }
        System.out.println("###########################################");
        // 2 binarysearch
        int b=Arrays.binarySearch(A,9);
        System.out.println("index "+b);
        // 3 hashcode
        System.out.println("###########################################");
        int c=Arrays.hashCode(A);
        System.err.println(c);
        // 4 fill method
        System.out.println("###########################################");
        Arrays.fill(A,12);
         for(int i=0;i<A.length;i++){
          //  System.out.print(A[i]);

        }
        System.out.println("###########################################");
        // 5 equals
       System.out.println( Arrays.equals(A,B));
       System.out.println("###########################################");
       // 6 tostring
       System.out.println(Arrays.toString(A)+"hai");
       System.out.println("###########################################");
       // 7 mismatch
       System.out.println(Arrays.mismatch(A,B));
       System.out.println("###########################################");
       // 8 copy array
       int[] copy = Arrays.copyOfRange(B, 2,5);
        for(int i=0;i<copy.length;i++){
            System.out.println(copy[i]);
        }
        System.out.println("###########################################");
        // 9 null or non null  
        Integer[] numbers = {1, 2, null, 4};
        boolean allNonNull = Arrays.stream(numbers).allMatch(Objects::nonNull);
        System.out.println(allNonNull);
        System.out.println("###########################################");
        // 10 Fill Arrays with Specific Range
        int[] num = new int[5];
        Arrays.setAll(num, index -> index * 2);        
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);

        }

        System.out.println("************************END***************************");
        int Arr[]={1,2,3,4,5,6,7,8,9,10};
        int Sum=0;
        System.out.println("################# (1) Sum OF ARRAY ##########################");
        for(int i=0;i<Arr.length;i++){ 
           Sum=Sum+Arr[i];
        }
        System.out.println(Sum);
        System.out.println("################# (2) AVERAGE OR MEAN OF ARRAY ##########################");
        int Mean=0;
         { 
            Mean=Sum/Arr.length-1;
            System.out.println(Mean);
           }
           System.out.println("################# (3) FIND THE ELEMENT OF ARRAY ##########################");
        System.out.println("Enter the element and index");
        int x=5;
        for(int i=0;i<Arr.length;i++){
            if(x==Arr[i]){
                System.out.println("Element "+Arr[i]+" is placed in position of index "+i);

            }
        }
        System.out.println("################# (4) SEARCH THE ELEMENT IF IS EXIST OR NOT EXIST OF ARRAY ##########################");
        System.out.println("Enter the element to check is exist or not :");
        int y=11;
        for(int i=0;i<Arr.length;i++){
            if(y==Arr[i]){
             System.out.println(y+" IS EXIST");
            }
            {
                System.out.println(y+" IS NOT EXIST");
            }
            break;
        }
        System.out.println("################# (5) Reverse OF ARRAY ##########################");
         for(int i=Arr.length-1;i<Arr.length;i--){ //4 , 4<5,i--
            System.out.println(Arr[i]);
            break; 
           }
    }
    public static void main(String[] args) {
        arrayMethods();
    }
    
}
