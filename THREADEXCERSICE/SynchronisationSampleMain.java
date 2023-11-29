package THREADEXCERSICE;


    public class SynchronisationSampleMain extends Thread {

        private Thread tRef;
        private String threadName;
        ThreadResourcePoint ts; // Reference object for calling resource..
    
        SynchronisationSampleMain(String name, ThreadResourcePoint ts) { // initialize instance variable
            threadName = name;
            this.ts = ts;
        }
    
        public void run() {
            synchronized (ts) {
                try {
                    ts.resource(); // Call resource
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } // sync
            System.out.println(threadName + " running completed");
        }// run
    
        public void start() {
            System.out.println("Starting " + threadName);
            if (tRef == null) {
                tRef = new Thread(this, threadName);
                tRef.start();
            }
        }
    
        public static void main(String args[]) throws InterruptedException {
    
            ThreadResourcePoint PD = new ThreadResourcePoint();
            SynchronisationSampleMain T1 = new SynchronisationSampleMain("Thread - 1 ", PD);
            SynchronisationSampleMain T2 = new SynchronisationSampleMain("Thread - 2 ", PD);
            SynchronisationSampleMain T3 = new SynchronisationSampleMain("Thread - 3 ", PD);
    
            T1.start();
            T2.join();
            T2.start();
            T3.setPriority(10);
            T3.start();
            System.out.println("THREAD NAME :");
            System.out.println(T1.getName()+","+T2.getName()+","+T3.getName());
            System.out.println("THEARD PRIORITY :");
            System.out.println(T1.getPriority()+","+T2.getPriority()+","+T3.getPriority());

    
        }// main
    
    }// class
    
    
    

    
    
