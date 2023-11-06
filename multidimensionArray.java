public class multidimensionArray {
    public static void normal (){
        int [][] bucket={{1,2,3},{4,5,6}};
        for(int i=0;i<bucket.length;i++){
            for(int j=0;j<bucket[i].length;j++){
                System.out.println(bucket[i][j]);
                
            }
        }
        System.out.println("***********************************************************");
    }
    public static void grid (){
        int [][] bucket={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<bucket.length;i++){
            for(int j=0;j<bucket[i].length;j++){
                System.out.print(bucket[i][j]+" ");
                
            }
            System.out.println("");

        }
        System.out.println("***********************************************************");
    }  
    public static void multi (){
        int  [][] bucket={{1},{4,5},{7,8,9},{10,11,12}};
        for(int i=0;i<bucket.length;i++){
            for(int j=0;j<bucket[i].length;j++){
                System.out.print(bucket[i][j]+" ");
                
            }
            System.out.println("");

        }
        System.out.println("***********************************************************");
    }  
    public static void index (){
        int [][] bucket={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<bucket.length;i++){
            for(int j=0;j<bucket[i].length;j++){
                System.out.println("index row is "+i+" column is "+j+bucket[i][j]+" ");
                
            }
            System.out.println("");
 
        }
        System.out.println("***********************************************************");
    } 
    public static void Sum (){
        int [][] bucket={{1,2,3},{4,5,6},{7,8,9}};
        int A=0;
         for(int i=0;i<bucket.length;i++){
            for(int j=0;j<bucket[i].length;j++){
            A= A+bucket[i][j];
            }
            }
           System.out.println("sum of the array is "+ A );
           System.out.println("***********************************************************");
        }

        public static void Avearge (){
        int [][] bucket={{1,2,3},{4,5,6},{7,8,9}};
        int A=0;
        int Avearge=0;
         for(int i=0;i<bucket.length;i++){
            for(int j=0;j<bucket[i].length;j++){
            A= A+bucket[i][j];
            }
            }
           Avearge=A/bucket.length;
           System.out.println("Average of the array is "+ Avearge);
           System.out.println("***********************************************************");
        }
    

    public static void main(String[] args) {
        normal();
        grid();
        multi();
        index();
        Sum();
        Avearge();

    }  
}
