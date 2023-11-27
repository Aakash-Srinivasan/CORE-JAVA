package Threads;

public class threadprocess {

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
        threadsample tone=new threadsample();
        tone.start();
        threadsample ttwo=new threadsample();
        ttwo.start();
    }
    
}
