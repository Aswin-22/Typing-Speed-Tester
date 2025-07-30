# Typing Speed Tester

TypingSpeedTester is a console-based Java application designed to measure a user's typing speed and accuracy. The program presents a random text prompt, allows the user to type it within a 30-second time limit or until completion, and calculates the Words Per Minute (WPM) and accuracy based on the input. The application uses a modular design with separate classes for text generation, timing, input handling, and result evaluation, ensuring maintainability and extensibility.

## Description

TypingSpeedTester presents a random line of text to the user. The application evaluates:
- Total words typed
- Accuracy by comparing user input to the original prompt
- Time taken to complete or timeout
- Uses clean threading to manage input and timer simultaneously

It includes:
- `TextProvider` - supplies random text prompts
- `TimerThread` - manages countdown
- `InputHandler` - handles typing input
- `ResultEvaluator` - computes accuracy and WPM
- `App` - coordinates everything

## Features

- **Random Text Prompts**: Selects prompts of varying difficulty levels
- **Timed Typing Test**: Test runs for 30 seconds or stops early if user finishes
- **Word-Based Accuracy**: Measures correctness based on word-to-word comparison
- **Words Per Minute (WPM)**: Speed is calculated in WPM based on time and word count
- **Clean Thread Management**: Input and timer are executed using Runnables and joined gracefully

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Command Line Interface (Terminal, Command Prompt)
- Git (optional, for cloning the repository)

## Setup Instructions

### 1. Clone the Repository

```
git clone https://github.com/Aswin-22/Typing-Speed-Tester.git
cd TypingSpeedTester
````

### 2. Ensure Java is Installed

```bash
java -version
```

If not installed, download JDK from Oracle or OpenJDK.

### 3. Compile the Code

```bash
javac *.java
```

### 4. Run the Program

```bash
java -cp . App
```

Alternatively, use an IDE like IntelliJ or VS Code to run `App.java` directly.

## Future Enhancements

* **Levenshtein-Based Accuracy**: Support character-level error tolerance for minor typos
* **Error Details**: Show expected vs typed words for incorrect entries
* **Real-Time Input**: Use libraries like JLine for smooth real-time character input
* **GUI Interface**: Implement with JavaFX or Swing for better UX
* **Difficulty Levels**: User can choose prompt complexity
* **Statistics Tracking**: Track and save results for progress analysis
* **Countdown Display**: Show time remaining live during the test
* **Parallel Streams**: Analyze performance data across multiple users using Java Streams

## License

Licensed under the [MIT License](LICENSE).



