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
    public static void main(String[] args) {
        normal();
        grid();
        multi();
        index();
    }  
}
