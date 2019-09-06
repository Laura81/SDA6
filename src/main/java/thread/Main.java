package thread;

public class Main {
    public static void main(String[] args) /*throws InterruptedException*/ {
        // StopWatchThread stopWatchThread = new StopWatchThread("ceva");
        // StopWatchThread stopWatchThread1 = new StopWatchThread("SW1");
        // StopWatchThread stopWatchThread2 = new StopWatchThread("SW2");
        // stopWatchThread1.start();
        // stopWatchThread2.start();
        // stopWatchThread1.run();
        // stopWatchThread2.run();
        // System.out.println("Main thread starts");
        // Thread.sleep(5000);
        // System.out.println("Main thread is still runing");
        // Thread.sleep(5000);
        // System.out.println("Main thread ends");
        // Thread t = new Thread(new StopWatchThread("hhh"));
        // t.start();
        Bench bench = new Bench(1);
        SeatTakerThread seatTakerThread1 = new SeatTakerThread(bench);
        SeatTakerThread seatTakerThread2 = new SeatTakerThread(bench);
        seatTakerThread1.start();
        seatTakerThread2.start();
        // seatTakerThread1.run();
        //seatTakerThread2.run();
    }
}
