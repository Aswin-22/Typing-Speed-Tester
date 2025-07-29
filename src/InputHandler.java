import java.util.Scanner;

public class InputHandler implements Runnable {
    private volatile boolean timeUp;
    private final StringBuilder typedText;
    private final String prompt;
    private final Thread timer;

    public InputHandler(boolean timeUp, String prompt, Thread timer){
        this.timeUp = timeUp;
        this.typedText = new StringBuilder();
        this.prompt = prompt;
        this.timer = timer;
    }

    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);
        String line;

        try {
            while(!timeUp && !Thread.currentThread().isInterrupted()){
                if(scanner.hasNextLine()){
                    line = scanner.nextLine().trim();
                    
                    if(!line.isEmpty()){
                        typedText.append(line);
                        String currInput = typedText.toString().trim();
                        System.out.println("You Typed: " + currInput);

                            if(currInput.equals(prompt.trim())){
                                timeUp = true;
                                System.out.println("You Completed the prompt Early.");
                                timer.interrupt();
                            }
                            else if (currInput.length() >= prompt.length()) {
                                timeUp = true;
                                System.out.println("\nInput completed! Evaluating results.");
                                timer.interrupt();
                            }
                    }
                    
                }
            }
        } finally {
            scanner.close();
        }
    }

    public String getString(){
        return typedText.toString().trim();
    }

    public void stopTest(){
        timeUp = true;
    }
}

