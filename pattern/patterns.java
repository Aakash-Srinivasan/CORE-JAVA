 package pattern;

public class patterns {
    public static void patternright() {
        int n=5;
        for(int i=0;i<n;i++){//row
            for(int j=0;j<=i;j++){//column
            System.out.print("* ");
            }
            System.out.println();//jump next row
        }

    }
    public static void patternreverse() {
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(int i=5;i>=1;i--){//row
            for(int j=1;j<=i;j++){//column
            System.out.print("* ");
            }
            System.out.println();//jump next row
        }
    }
    public static void left() {// 3for loops
        System.out.println("-----------------------------------------------------------------------------------------------");
    for(int i=0;i<5;i++){

        for(int k=2*(5-i);k>0;k--){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    public static void pyramidnum(){
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(int i=1;i<5;i++){

            for(int k=(5-i);k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
     public static void pyramid(){
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(int i=1;i<5;i++){

            for(int k=(5-i);k>0;k--){
                System.out.print(" ");
            } 
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void diamond(){
System.out.println("-----------------------------------------------------------------------------------------------");
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x=0;x<5;x++){
            for(int y=5;y>=x;y--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void reversedpyramid(){
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(int i=4;i>=0;i--){
            for(int k=(5-i);k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
    
    public static void main(String[] args) {
        patternright();
        patternreverse();
        left();
        pyramid();
        pyramidnum();
        diamond();
        reversedpyramid();
    
    }
    
}
