- GUI calculator with JavaFX or Swing?
- Java2D API for doing basic shapes etc
- `java.time` for dates and times
- `java.awt.Color` for colors and `java.awt.Font` for fonts
- `java.awt.geom` for shapes
- `java.net.URL` and `java.net.URI` for URLs


## String Utils

[Apache's String Utils](https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html)

- isPalindrome (checks whether the reverse of a string is the same as the original; needs .equal)
- PrintBanner: use LeftPad/RightPad/Center/Repeat to make a nice looking banner message. maybe input a name, or a epitaph, or something funny like that... Also, trim it if it's an epitaph so it fits. Could integrate with JFrames later I guess...
- character count
- word count / sentence count (`countMatches`)
- line count...?
  23 265 1440 Unit02/Xtras/gettysburg-address.txt
  34 1686 9329 Unit02/Xtras/i-have-a-dream.txt
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
