# Task3
# Library Management System (Java OOP)

## Description
This is a simple console-based Library Management System written in Java using Object-Oriented Programming concepts. It supports:
- Adding books to the library
- Issuing books to a user
- Returning books
- Viewing available books

## Classes Used
### Book.java
Handles book details like title and issue status.

### User.java
Stores user name.

### Library.java
Contains the core library functionalities like issuing, returning, and listing books.

### Main.java
User interface with menu-driven options.

## How to Run
1. Compile all `.java` files using a Java compiler:
   ```sh
   javac *.java
   ```

2. Run the main program:
   ```sh
   java Main
   ```

## Example Output
```
Enter your name: Altaf
Book added: Java Programming
Book added: Python Basics
Book added: Data Structures

--- Menu ---
1. Show Books
2. Issue Book
3. Return Book
0. Exit
Choose: 1
Available books:
Java Programming
Python Basics
Data Structures
```
