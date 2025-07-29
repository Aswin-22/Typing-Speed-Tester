import java.util.Random;

public class TextProvider {
    private static final String[] SAMPLE_TEXTS = {
        "The quick brown fox jumps over the lazy dog",
        "A journey of a thousand miles begins with a single step",
        "To be or not to be that is the question",
        "All that glitters is not gold",
        "The only limit to our realization of tomorrow is our doubts of today"
    };

    public String getRandomText() {
        Random random = new Random();
        return SAMPLE_TEXTS[random.nextInt(SAMPLE_TEXTS.length)];
    }
}