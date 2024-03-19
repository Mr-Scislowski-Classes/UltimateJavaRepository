# Text Similarity

There are many ways to measure how similar two pieces of text are. In this assignment we will explore two algorithms: the Levenshtein distance and the Fuzzy score. We will use the Apache Commons Text library to do this.

## Getting used to the library

1. `GettingStarted.java`

Write a program that uses `Scanner` and asks the use to type in two words. It should then display the Fuzzy score between those two words, and the Levenshtein distance between those two words.

For example:

```
Please enter your first word:
participate
Please enter your second word:
articulate
The Fuzzy Score between 'participate' and 'articulate' is: 13
The Levenshtein Distance between 'participate' and 'articulate' is: 3
```

2. `UsingDictionary.java`

Write a program that uses `Scanner` and asks the user to type in a word. It should calculate the Fuzzy score and LevenshteinDistance between each word in the dictionary (which you can load using the `getEnglishWords` method provided) and the word itself. Display the best fuzzy score match, and the best Levenshtein distance match.

For example:

```
Please enter your word:
edep
Closest word using fuzzy algorithm was: depart
Closest word using Levenshtein algorithm was: adept
```

3. `ChooseFont.java`

You can get an array of all the fonts available to Java's graphics environment using:

```java
String[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
```

Display all the fonts available to the user, and ask them to type a font name. They shouldn't have to spell the font name perfectly with matching spaces and case etc. Based on what they typed in, show them the top 3 fonts that match the text they typed in.
