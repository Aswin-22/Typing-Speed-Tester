public class ResultEvaluator {
    private String prompt;
    private String text;

    public ResultEvaluator(String prompt, String text) {
        this.prompt = prompt;
        this.text = text;
    }

    public int getWpm(int duration){

        int wordCount = this.text.split("\\s+").length;
        double min = duration / 60.0;
        int wpm = (int)(wordCount / min);

        return wpm;
    }

    public double getAccuracy(){
        
        int crt = 0;
        int len = Math.min(this.prompt.length(), this.text.length());

        for (int i = 0; i < len; i++) {
            if(this.prompt.charAt(i) == this.text.charAt(i)){
                crt++;
            }
        }

        double accuracy = (crt * 100.0) / this.prompt.length();
        return accuracy;
    }
    
}
