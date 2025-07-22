import java.util.concurrent.atomic.AtomicBoolean;

public class TimerThread extends Thread {
    private int duration;
    private AtomicBoolean timeUp;

    TimerThread(int duration, AtomicBoolean timeUp) {
        this.duration = duration;
        this.timeUp = new AtomicBoolean(false);
    }

    
    public void run(){
        try {
            for (int i = duration; i > 0; i--) {
                int bars = duration - i + 1;
                int empty = duration - bars;
                String ProgressBar = "[" + "█".repeat(bars) + "-".repeat(empty) + "]";
                System.out.print(String.format("\rTime left: %2ds %-35s", i, ProgressBar));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Timer interrupted: " + e.getMessage());
        } finally{
            timeUp.set(true);
            System.out.print("\r                                                  ");
            System.out.print("\rTime is up!");
        }
    }
}
