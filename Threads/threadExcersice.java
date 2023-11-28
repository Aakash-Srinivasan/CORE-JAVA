package Threads;

import String.name;

public class threadExcersice implements Runnable{
    String threadname;
    Thread actualThread;
    Resourcesthread resorceThread;

    public  threadExcersice(String string,Resourcesthread actualThread){
        threadname=string;
        resorceThread=actualThread;
    }
    public void run(){
        synchronized(resorceThread){
            try {
                resorceThread.actualresource();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public void start(){
        System.out.println("Thread started"+threadname);
        if(actualThread!=null){
            actualThread=new Thread(this,"");
            actualThread.run();
    
        }

    }
    public static void main(String[] args) throws InterruptedException {
       Resourcesthread actualthread=new Resourcesthread();
       threadExcersice tone=new threadExcersice("Thread -1",actualthread);
       threadExcersice ttwo=new threadExcersice("Thread -2",actualthread);
       tone.start();
       Thread.sleep(5000);
       ttwo.start();
        }
    
}
