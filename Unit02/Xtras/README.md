## Basic String Exercises

- Chosen exercises:
  - [hello name](https://codingbat.com/prob/p171896)
  - [firstHalf](https://codingbat.com/prob/p172267)
  - [endsLy](https://codingbat.com/prob/p103895)
  - [makeAbba](https://codingbat.com/prob/p161056)
  - [withoutEnd](https://codingbat.com/prob/p130896)
  - [nTwice](https://codingbat.com/prob/p174148)
  - [makeTags](https://codingbat.com/prob/p147483)
  - [middleTwo](https://codingbat.com/prob/p137729)
- write tests in Junit

## Scanner

- basic calculator (adding two numbers) - demo... also say their name so I'm reading strings, and reading ints.
- quadratic formula solutions (prompt for a, b, c)
- old discord handle generator (prompt for username, it'll append # and 4 random digits)
- Tweet abbreviator (prompt for a tweet, it'll abbreviate it to 140 characters)

TODO: other things using methods in Java Quick Reference (`length`, `substring/2`, `substring/1`, `indexOf`, `equals`, `compareTo`)
ideas:

    - lengthOfFirstWord
    - getFirstWord
    - same with first sentence
    - we could get character & word count & line count & sentence count using `countMatches`

## String Utils

[Apache's String Utils](https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html)

- isPalindrome (checks whether the reverse of a string is the same as the original; needs .equal)
- PrintBanner: use LeftPad/RightPad/Center/Repeat to make a nice looking banner message. maybe input a name, or a epitaph, or something funny like that... Also, trim it if it's an epitaph so it fits. Could integrate with JFrames later I guess...
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
