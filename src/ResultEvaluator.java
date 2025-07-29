public class ResultEvaluator {
    private final String prompt;
    private final String text;
    private final double duration;

    public ResultEvaluator(String prompt, String text, double duration) {
        this.prompt = prompt;
        this.text = text;
        this.duration = duration;
    }

    public double getWPM(){
        String[] typedWords = text.split("\\s+");
        int wordCount = typedWords.length;
        return (duration > 0) ? (wordCount / duration) * 60 : 0;
    }

    public double getAccuracy(){
        String[] typedWords = text.split("\\s+");
        String[] targetWords = prompt.split("\\s+");
        int correctWords = 0;
        int totalWords = targetWords.length;

        int minLength = Math.min(typedWords.length, targetWords.length);
        for (int i = 0; i < minLength; i++) {
            if (typedWords[i].equals(targetWords[i])) {
                correctWords++;
            }
        }

        return (totalWords > 0) ? (correctWords * 100.0 / totalWords) : 0;
    } 

     public void displayResults() {
        System.out.printf("\nResults:\n");
        System.out.printf("Words Per Minute (WPM): %.2f\n", getWPM());
        System.out.printf("Accuracy: %.2f%%\n", getAccuracy());
    }
}

