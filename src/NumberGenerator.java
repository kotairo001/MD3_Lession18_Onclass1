public class NumberGenerator extends Thread implements Runnable{
    private Thread myThread;
    public NumberGenerator(){
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException i) {
            System.out.println("My thread was interrupted");
        }
        System.out.println("My thread run is over");
    }

    public void start () {
        if(myThread==null){
            myThread=new Thread(this);
            myThread.start();
        }
    }

}
