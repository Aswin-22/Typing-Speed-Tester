import java.util.concurrent.atomic.AtomicBoolean;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(TextProvider.getPrompt(1));
        AtomicBoolean timeUp = new AtomicBoolean(false);
        TimerThread timer = new TimerThread(30, timeUp);
        timer.start();
    }
}
