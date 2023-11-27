package Threads;

public class threadsample extends Thread{
    public void run(){
    
            for(int i=0;i<3;i++){
                System.out.println("looping ="+i);
            }
            System.out.println("Thread terminated");
       
    }
    public void start(){
        System.out.println("Theread Started");
        Thread actualT=new Thread();
        actualT.run(); 
        
    }
    public static void main(String[] args) {
        threadsample tref=new threadsample();
        tref.start();
    }
    
}
