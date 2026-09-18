# Minimax Tic-Tac-Toe AI

**Author:** Prathmesh Tandon (25BAI11352) - Fundamentals of AI and ML

## Overview of the Project
An unbeatable Tic-Tac-Toe opponent built entirely in standard Java. This project demonstrates foundational artificial intelligence concepts by implementing the Minimax algorithm to navigate and evaluate game trees in real-time. 

## Features
* **Optimal Decision Making:** The AI anticipates human moves and mathematically guarantees at least a draw.
* **Zero Dependencies:** Runs on pure Java without requiring external libraries or package managers.
* **Modular Architecture:** Separates game logic, state evaluation, and AI processing into distinct class files.

## Technologies/Tools Used
* Java (JDK 8 or higher)
* Git (Version Control)

## Steps to Install & Run the Project
1. Clone the repository to your local machine: `git clone [repository_url]`
2. Open a terminal or command prompt and navigate to the source code folder.
3. Compile the Java files: `javac *.java`
4. Execute the main program: `java Main`

## Instructions for Testing
1. Launch the game using the run instructions above.
2. The grid uses a 0-indexed coordinate system. Input your moves by typing the row and column separated by a space (e.g., `1 1` for the center square).
3. Attempt to set up a "fork" (two winning threats simultaneously) to validate that the AI correctly blocks the threat in advance. 
4. Attempt to input invalid coordinates (e.g., `3 3` or a space already taken) to verify the error-handling logic.

