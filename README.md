# Quiz Application

## 📌 Overview

Quiz Application is a console-based Java project that allows users to participate in a multiple-choice quiz. Questions are loaded dynamically from an external text file, displayed in random order, and evaluated instantly. At the end of the quiz, the user's score is calculated and stored in a file for future reference.

This project demonstrates the use of Object-Oriented Programming (OOP), file handling, collections, exception handling, and user interaction in Java.

---

## 🚀 Features

* Load quiz questions from an external file
* Multiple-choice question format
* Randomized question order using Collections.shuffle()
* Automatic answer checking
* Real-time feedback for correct and incorrect answers
* Final score calculation
* Score history saved to a file
* Easy to add or modify questions without changing source code

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* File Handling
* Collections Framework
* Exception Handling
* Scanner Class

---

## 📂 Project Structure

QuizApplication/

├── QuizApp.java

├── questions.txt

├── score.txt

└── README.md

### File Description

#### QuizApp.java

Main source file containing:

* Question class
* Quiz logic
* Question loading functionality
* Score saving functionality

#### questions.txt

Stores all quiz questions.

Format:

Question

Option 1

Option 2

Option 3

Option 4

Correct Option Number

Example:

What is the capital of India?

Delhi

Mumbai

Kolkata

Chennai

1

#### score.txt

Stores quiz scores after each attempt.

Example:

Score: 8/10

Score: 9/10

---

## ⚙️ How It Works

1. Questions are read from questions.txt.
2. Questions are stored in an ArrayList.
3. The question list is shuffled randomly.
4. Each question is displayed to the user.
5. User enters an answer (1–4).
6. The answer is validated.
7. Score is updated accordingly.
8. Final score is displayed.
9. Score is saved in score.txt.

---

## ▶️ How to Run

### Compile

```bash
javac QuizApp.java
```

### Run

```bash
java QuizApp
```

Make sure questions.txt is located in the same directory as QuizApp.java.

---

## 📸 Sample Output

===== Simple Quiz Application =====

Q1. Which language is used for Android development?

1. Python

2. Java

3. C

4. PHP

Enter your answer: 2

Correct!

Q2. What is the capital of India?

1. Mumbai

2. Kolkata

3. Delhi

4. Chennai

Enter your answer: 3

Correct!

===== Quiz Finished =====

Your Score: 2/2

Score saved successfully.

---

## 🎯 Learning Outcomes

Through this project, you can learn:

* Java Classes and Objects
* ArrayList Implementation
* File Reading and Writing
* Exception Handling
* User Input Processing
* Randomization Techniques
* Program Modularization
* Basic Application Development

---

## 🔮 Future Enhancements

* Graphical User Interface (GUI)
* Web-based Frontend
* Timer-based Quiz
* Difficulty Levels
* User Authentication
* Leaderboard System
* Database Integration
* Category-wise Questions
* REST API Integration
* Detailed Performance Analytics

---

## 👨‍💻 Author

Rahul Ray

Computer Science Engineering Student

Java | C++ | Python | Web Development | Problem Solving

---

⭐ If you found this project useful, consider giving it a star on GitHub!
