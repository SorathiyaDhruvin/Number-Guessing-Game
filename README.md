# 🎯 Number Guessing Game in Java

[![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)](#)

A classic interactive console-based **Number Guessing Game** built in Java. The computer randomly picks a secret number between **1 and 100**, and the player has a limited number of attempts (5 attempts) to guess it using dynamic feedback hints (*"Too High"* or *"Too Low"*).

---

## 📌 Table of Contents
- [Features](#-features)
- [Game Rules](#-game-rules)
- [Flowchart](#-flowchart)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
  - [Prerequisites](#prerequisites)
  - [Compilation & Execution](#compilation--execution)
- [Gameplay Preview](#-gameplay-preview)
- [Author](#-author)

---

## ✨ Features
- 🎲 **Random Number Generation**: Dynamically picks a random integer from `1` to `100` each round.
- 💡 **Smart Hint System**: Guides the player after every guess (`Too high` or `Too low`).
- ⏳ **Limited Attempts**: Challenge mode with 5 total guesses to test deduction and binary search strategy.
- 🛡️ **Input Validation**: Gracefully handles non-numeric or invalid inputs without crashing.
- 💻 **Zero Dependencies**: Pure Java implementation runnable on any system with JDK installed.

---

## 📜 Game Rules
1. The game selects a hidden number between **1 and 100** (inclusive).
2. You have a maximum of **5 attempts** to guess the correct number.
3. For each guess:
   - If your guess equals the target number: **You Win! 🏆**
   - If your guess is lower than the target: The game prompts that the number is **higher**.
   - If your guess is higher than the target: The game prompts that the number is **lower**.
4. If you run out of all attempts without guessing correctly, the game reveals the secret number: **Game Over ❌**.

---

## 📊 Flowchart

The following flowchart illustrates the step-by-step logic of the Number Guessing Game:

```mermaid
flowchart TD
    Start([🟢 Start Game]) --> Init[Generate Random Number between 1 and 100<br/>Set Max Attempts = 5<br/>Attempt Count = 1]
    Init --> Prompt[/Display Welcome Message & Rules/]
    Prompt --> Input[/Prompt Player for Guess (Attempt n of 5)/]
    Input --> Validate{Is Input a<br/>Valid Integer?}
    
    Validate -- No --> ErrorMsg[Show 'Invalid Input' Error]
    ErrorMsg --> Input
    
    Validate -- Yes --> CheckGuess{Compare Guess with<br/>Generated Number}
    
    CheckGuess -- "Guess == Number" --> Win[/🎉 Congratulations!<br/>Player Wins!/]
    Win --> End([🔴 End Game])
    
    CheckGuess -- "Guess < Number" --> HintLow[/📉 Hint: Number is GREATER than Guess/]
    CheckGuess -- "Guess > Number" --> HintHigh[/📈 Hint: Number is LESS than Guess/]
    
    HintLow --> CheckAttempts{Attempt Count < Max Attempts?}
    HintHigh --> CheckAttempts
    
    CheckAttempts -- Yes --> NextAttempt[Attempt Count = Attempt Count + 1]
    NextAttempt --> Input
    
    CheckAttempts -- No --> GameOver[/❌ Attempts Exhausted!<br/>Reveal Secret Number/]
    GameOver --> End
```

---

## 📁 Project Structure

```text
Number-Guessing-Game/
├── NumberGuessingGame.java   # Main Java source code containing game logic
├── README.md                 # Detailed documentation & flowchart
└── .gitignore                # Git ignore configuration for Java artifacts
```

---

## 🚀 Getting Started

### Prerequisites
Make sure you have Java Development Kit (**JDK 8** or newer) installed on your system.
Verify your installation:
```bash
javac -version
java -version
```

### Compilation & Execution

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Parth9100/Number-Guessing-Game.git
   cd Number-Guessing-Game
   ```

2. **Compile the Java program:**
   ```bash
   javac NumberGuessingGame.java
   ```

3. **Run the game:**
   ```bash
   java NumberGuessingGame
   ```

---

## 🎮 Gameplay Preview

```text
================================================
       🎯 Welcome to Number Guessing Game       
================================================
I have chosen a number between 1 and 100.
You have 5 attempts to guess it. Good luck!

Attempt 1/5 -> Enter your guess: 50
📉 Too low! The target number is greater than 50.

Attempt 2/5 -> Enter your guess: 75
📈 Too high! The target number is less than 75.

Attempt 3/5 -> Enter your guess: 63
📉 Too low! The target number is greater than 63.

Attempt 4/5 -> Enter your guess: 69
🎉 Congratulations! You guessed the correct number (69) in 4 attempts!
🏆 You won the game!
```


