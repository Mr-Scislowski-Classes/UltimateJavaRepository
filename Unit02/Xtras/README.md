
## Scanner

### Demo

1. [ScannerDemo.java](ScannerDemo.java)

    Prompt the user for their name, then say hello to them. Then ask them to input two numbers they'd like to add together, then print the sum of those two numbers in a nice format.

### Exercises

1. [QuadraticSolver.java](QuadraticSolver.java)

    Prompt the user for the coefficients of a quadratic equation (`a`, `b`, and `c` in the equation `a x^2 + b x + c = 0`), then print the two solutions to the equation. You can assume that the user will only input values that will result in two real solutions.

    Some examples:

    - The solutions to `2 x^2 + 9 x - 5 = 0` are `x = 0.5` and `x = -5`.

    - The solutions to `x^2 - 2 x - 1` are `x = 1 + sqrt(2) = 2.414...` and `x = 1 - sqrt(2) = -0.414...`.

1. [DiscordTagGenerator.java](DiscordTagGenerator.java)

    Prompt the user for their desired username. Generate a random 4-digit number and append it to the end of their username with a "#" sign. Print the result. For example, a user named "Bob" might get the tag "Bob#8311".

1. [BasicTextAnalysis.java](BasicTextAnalysis.java)

    Prompt the user to type in some text. Print the following information about the text they entered:
      - The number of characters in the text
      - The first word in the text (words are separated by spaces)
      - The first sentence in the text (sentences are separated by periods)

    Using the `Scanner` class, you can read multiple lines of text (until the user enters Ctrl-d) by using the following code:
  
      ```
      scan.useDelimiter("\\Z");
      scan.next();
      ```


    Run these programs on the "Gettysburg Address" and "I Have a Dream" text files to give output like:

    ```
    cat gettysburg.txt | java Unit02.Xtras.BasicTextAnalysis
    ```
    
    To give something like:

    ```
    Enter your text: Your text is 1439 characters long.
    The first word is: Four
    The first sentence is: Four score and seven years ago our fathers brought forth on this
    continent a new nation, conceived in liberty and dedicated to the
    proposition that all men are created equal.
    ```


## String Utils

[Apache's String Utils](https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html)

- isPalindrome (checks whether the reverse of a string is the same as the original; needs .equal)
- PrintBanner: use LeftPad/RightPad/Center/Repeat to make a nice looking banner message. maybe input a name, or a epitaph, or something funny like that... Also, trim it if it's an epitaph so it fits. Could integrate with JFrames later I guess...
- character count
- word count / sentence count (`countMatches`)
- line count...?
          23     265    1440 Unit02/Xtras/gettysburg-address.txt
          34    1686    9329 Unit02/Xtras/i-have-a-dream.txt
- Use [Levenshtein Distance](https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/similarity/LevenshteinDistance.html) and [Fuzzy Score](https://commons.apache.org/proper/commons-text/javadocs/api-release/org/apache/commons/text/similarity/FuzzyScore.html) to tell a user how close they are. Ask ChatGPT about other measures of text similarity, and what the applications for them are.

## Graphics - Fonts

[Java's font class](https://docs.oracle.com/javase/8/docs/api/java/awt/Font.html)

- Font Previewer:
  - use getFonts() to show all the options for fonts
  - then have the user type one in that they want to use
  - the fuzzy score thing could be cool in future once we have iteration in picking which one they wanted
  - then fill the JFrame with that font, with a PLAIN, a BOLD, and an ITALIC version

## Graphics - Colors

- Understand [Java's Color class](https://docs.oracle.com/javase/8/docs/api/java/awt/Color.html) enough to make assignments on it

## Geometry

- Decide what to do with the [Geom class](https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/awt/geom/package-summary.html)... I like the idea of making a banner involving your name in a color with some geometric objects, then saving a screenshot of it.
