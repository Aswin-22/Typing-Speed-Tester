public class TextProvider {
    private static final String[] Prompts = {
        "Typing is a useful skill in daily life. It helps us write emails, chat with friends, and search online. Practice makes you better and faster every single day.",
        "Typing quickly with accuracy takes time and practice. Focus on keeping your eyes on the screen and your fingers on the right keys. The more you type, the more confident you will become. Avoid looking at the keyboard and trust your muscle memory.",
        "Improving your typing speed involves not only practicing regularly but also maintaining a consistent rhythm. Advanced typists rely on muscle memory and finger placement to glide through complex words and punctuation. Mistakes must be corrected swiftly, without losing flow. Over time, your brain adapts to higher speeds while ensuring clarity and precision, especially when under pressure or in professional environments."
    };

    public static String getPrompt(int index) {
        if (index < 0 || index >= Prompts.length) {
            throw new IndexOutOfBoundsException("Invalid prompt index: " + index);
        }
        return Prompts[index];
    }
}
