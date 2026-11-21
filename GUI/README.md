# GUI Assignment

This folder contains a simple Java GUI application that converts a temperature from Celsius to Fahrenheit.

## Project Description

The application is built with Swing and displays a small window containing an input field and a conversion button. Enter a Celsius temperature, click **Konversi**, and the Fahrenheit result is shown in the window.

## Source Code

- `Main.java` - creates the GUI, reads the Celsius value, performs the conversion, and displays the result.

## Example of 5 GUI Components/Parts

The code demonstrates five Swing GUI components or layout parts:

1. **JFrame** - `frame` is the application's main window. It has the title **Kalkulator Celscius to Fahrenheit**.
2. **JPanel** - `panel` is the container that organizes the GUI components.
3. **JTextField** - `input` accepts the Celsius temperature entered by the user.
4. **JButton** - `konversi` triggers the temperature conversion when clicked.
5. **JLabel** - `label` describes the input, while `hasil` displays the conversion result.

## GUI Layout

- `BorderLayout.EAST` places the panel in the east area of the frame.
- `JTextField(10)` creates an input field with a width suitable for 10 characters.
- `frame.setSize(480, 100)` defines the size of the application window.
- `frame.setVisible(true)` makes the window visible.

## Conversion Logic

When the conversion button is clicked, `ActionListener` reads the text from `input`, converts it to `Double`, and applies the formula:

```text
fahrenheit = (celcius * 9 / 5) + 32
```

The converted value is then placed in `hasil` with `setText()`.

## How to Run

Open a terminal in this folder and run:

```sh
javac *.java
java Main
```

Make sure a Java Development Kit (JDK) with Swing support is installed.

## Screenshot

![Temperature conversion GUI](./Screenshot%202026-11-21%20125819.png)
