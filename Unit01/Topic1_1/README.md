# 1.1 Why Programming? Why Java? 

## Leaving Notes in README.md Files

Leave notes here of things you learn while watching the videos. This file is in Markdown format, which allows you to include **bold** and _italic_ text, as well as lists, links, and images. An information-dense cheatsheet for Markdown can be found [here](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

## Trying Out Code in Main.java Files

The `Main.java` files in each folder are meant to be used to try out the code you see in the videos, to experiment with your own code, and to explore the code referenced in the assigned questions. 

There should be a "Run" button at the top of the editor window that will compile and run the code in the `Main.java` file. I also encourage you to occasionally compile and run the code from the command line as this offers additional flexible ways of running the code (more details later). If your terminal is at the base directory (`UltimateJavaRepository`), you can compile and run the files like so:

```
javac Unit01/Topic1_1/Main.java
java Unit01.Topic1_1.Main
```

Sorry about the more complicated syntax for running the code from the command line; it's a necessary Java thing if you're going to keep your code organized in a big repository like this.

## Video 1
Multi line comments start with "/*" and end with "*/"
You have to declare "public class Main" at the start of a Java program (Main is replaced with whatever the name of the file is)
You have to declare a main method, in which the code actually takes place. "public static void main(String[] args) {}"
System.out displays something in the console
System.out.print prints a string to the console, and waits at the end of that line
System.out.println prints a string to the console, and then moves on to the next line
## Video 2
String literals are phrases, words, etc. enclosed in double quotes
Syntax errors are things that return errors, like missing a semicolon
Logic errors are issues that return incorrect output, like adding numbers incorrectly
## Video 3
Exception errors are issues like dividing by zero
Java is very finicky