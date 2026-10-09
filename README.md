# Object-Oriented Programming Exercises

This repository contains Java exercises for practicing object-oriented programming (OOP). Each folder is a separate exercise and can be compiled and run independently.

## Projects

### Bank Assignment

A simple console-based bank program. `BankDemo` keeps customers in an `ArrayList`, lets the user switch between customers, and supports deposits and withdrawals. Each customer's balance is stored separately.

Main source files:

- `Bank.java` - stores and retrieves the customer list.
- `Customer.java` - stores a customer's name and balance, with deposit and withdrawal methods.
- `BankDemo.java` - runs the interactive banking menu.
- `BankTry.java` - an earlier, single-customer bank example.

Run from the `Bank Assignment` folder:

```sh
javac *.java
java BankDemo
```

To run the earlier example instead, use `java BankTry`.

### Bujur Sangkar Assignment

Demonstrates inheritance and method overriding with geometric shapes. `Bentuk` is the base class; `BujurSangkar`, `Lingkaran`, and `Silinder` provide shape-specific calculations and output.

Run from the `Bujur Sangkar assignment` folder:

```sh
javac *.java
java Driver
```

Screenshot: [shapes output](<Bujur Sangkar assignment/images/Screenshot.png>)

### Exercise

Contains two standalone console exercises:

- `BangunRuang.java` - calculates surface areas and volumes for cubes, boxes, and spheres.
- `Calc.java` - a basic calculator for two numbers.

Run either one from the `Exercise` folder:

```sh
javac BangunRuang.java
java BangunRuang
```

```sh
javac Calc.java
java Calc
```

## Requirements

- Java Development Kit (JDK) installed and available on your command line (`java` and `javac`).
- No external libraries are required. The exercises use Java's standard library, including `java.util.ArrayList` and `java.util.Scanner`.

## OOP Concepts Practiced

- Classes, objects, fields, constructors, and methods
- Encapsulation and object state
- Collections with `ArrayList`
- Inheritance and method overriding
- Console input and output
- Basic calculations and validation
