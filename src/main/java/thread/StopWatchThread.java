package thread;

public class StopWatchThread  implements Runnable /*extends Thread */{

    private String prefix;

    public StopWatchThread(String prefix) { this.prefix=prefix; }

    @Override
    public void run(){
        for (int i=0; i<11; i++) {
           // System.out.println(prefix+":"+ i);
            System.out.println("Stop watch: "+i);
            try {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }finally {
            }
        }
    }
}
