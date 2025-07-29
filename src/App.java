public class App {
    public static void main(String[] args) throws Exception {

        TextProvider textProvider = new TextProvider();
        String prompt = textProvider.getRandomText();

        System.out.println("Type the following text: \n" + prompt);
        System.out.println("Duration 30 seconds. Press Enter to start....");

        boolean timeUp = false;

        long startTime = System.currentTimeMillis();

        TimerThread timerThread = new TimerThread(30000, timeUp);
        Thread timer = new Thread(timerThread);
        timer.start();

        InputHandler inputHandler = new InputHandler(timeUp, prompt, timer);
        Thread inputThread = new Thread(inputHandler);
        inputThread.start();

        try {
            timer.join();
        } catch (InterruptedException e) {
            // Timer interrupted, proceed to results
        }

        inputHandler.stopTest();
        inputThread.interrupt();

        long endTime = System.currentTimeMillis();
        double timeInSeconds = (endTime - startTime) / 1000.0;
        ResultEvaluator evaluator = new ResultEvaluator(prompt, inputHandler.getString(), timeInSeconds);
        evaluator.displayResults();

        System.exit(0);



    }
}

