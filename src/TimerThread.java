public class TimerThread implements Runnable {
    private final long duration;
    private volatile boolean timeUp;

    public TimerThread(long duration, boolean timeUp) {
        this.duration = duration;
        this.timeUp = timeUp;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(duration);
            timeUp = true;
            System.out.println("\nTime's up!");
        } catch (InterruptedException e) {
            timeUp = true;
        } 
    }

    public boolean isTimeUp(){
        return timeUp;
    }

    public void stopTest() {
        timeUp = true;
    }
}


