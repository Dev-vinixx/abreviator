# TextAbbreviator

A Java library for abbreviating words and text snippets.

## Description

The **TextAbbreviator** library provides several methods for simplifying and shortening words and phrases in text. Whether you need to reduce the length of long strings or create abbreviated versions for display, this library can be helpful.

## Available Methods

Here are the methods provided by the library:

1. **abbreviateWordFromStart(String word, int maxLength): String**
    - Abbreviates a word from the beginning, keeping a maximum of `maxLength` characters.

2. **abbreviateWordFromEnd(String word, int maxLength): String**
    - Abbreviates a word from the end, keeping a maximum of `maxLength` characters.

3. **abbreviateWordsFromTo(String text, int start, int end): String**
    - Abbreviates words in the text between positions `start` and `end`.

4. **abbreviateFromWordToWord(String text, String startWord, String endWord): String**
    - Abbreviates the text between occurrences of the `startWord` and `endWord`.

5. **abbreviateFromStart(String text, int maxLength): String**
    - Abbreviates the text from the beginning, keeping a maximum of `maxLength` characters.

6. **abbreviateFromEnd(String text, int maxLength): String**
    - Abbreviates the text from the end, keeping a maximum of `maxLength` characters.

7. **abbreviateFromIndexToIndex(String text, int startIndex, int endIndex): String**
    - Abbreviates the text between positions `startIndex` and `endIndex`.

## How to Use

1. **Add the Dependency**
    - To use the library, add the following Maven dependency to your project:

   ```xml
   <dependency>
       <groupId>com.abreviator</groupId>
       <artifactId>Abreveiator-gestor</artifactId>
       <version>1.0-SNAPSHOT</version>
   </dependency>
   
## Usage Example

    import abreviator.*;

    public class Main {
     public static void main(String[] args) {
      Abreviator abreviator = new Abreviator();
      try {
            System.out.println(abreviator.abbreviateFromWordToWord("Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "amet", "adipiscing"));
      } catch (Exception e) {
            System.out.println(e.getMessage());
      }
     }
    }

## License

  **Open Source Project**
   - This is a sample project developed in Java 17 for a competition. However, it has the potential to be expanded further.


                                           @..@
                                          (----)
                                         ( >__< )
                                         ^^ ~~ ^^
