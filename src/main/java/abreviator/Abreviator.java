package abreviator;

import customExceptions.TextOverwrittenExeption;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.Arrays;
import java.util.NoSuchElementException;
public class Abreviator {
    public String abbreviateWordFromStart (@NotNull String text, @Range(from = 0, to = Integer.MAX_VALUE) int abbreviateWords) throws NullPointerException, TextOverwrittenExeption {
        if (text.isBlank()) {
            throw new NullPointerException("received null object. Expected a non-null object.");
        }
        String[] words = text.split(" ");
        if (words.length < abbreviateWords) {
            throw new TextOverwrittenExeption("this action is not possible as it will erase all the received text, please try again with a new base value or a new text.");
        }
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < abbreviateWords; i++) {
            response.append(words[i]).append(" ");
        }
        response.append("...");
        return response.toString();
    }
    public String abbreviateWordFromEnd (@NotNull String text, int abbreviateWords) throws NullPointerException, TextOverwrittenExeption {
        if (text.isBlank()) {
            throw new NullPointerException("received null object. Expected a non-null object.");
        }
        String[] words = text.split(" ");
        if (words.length < abbreviateWords) {
            throw new TextOverwrittenExeption("this action is not possible as it will erase all the received text, please try again with a new base value or a new text.");
        }
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < (words.length - abbreviateWords); i++) {
            response.append(words[i]).append(" ");
        }
        response.append("...");
        return response.toString();
    }
    public String abbreviateWordsFromTo(@NotNull String text, int from, int to) throws NullPointerException, TextOverwrittenExeption {
        if (text.isBlank()) {
            throw new NullPointerException("received null object. Expected a non-null object.");
        }

        String[] words = text.split(" ");
        if (from < 0 || to > words.length || from > to) {
            throw new TextOverwrittenExeption("this action is not possible as it will erase all the received text, please try again with a new base value or a new text.");
        }

        String before = String.join(" ", Arrays.copyOfRange(words, 0, from));
        String during = String.join(" ", Arrays.copyOfRange(words, from, to));
        String after = String.join(" ", Arrays.copyOfRange(words, to, words.length));

        String[] duringWords = during.split(" ");
        String abbreviatedDuring = duringWords[0] + "..." + duringWords[duringWords.length - 1];

        return (before + " " + abbreviatedDuring + "  " + after).trim();
    }
    public  String abbreviateFromWordToWord(@NotNull String text, @NotNull String startWord, @NotNull String endWord) throws NullPointerException, NoSuchElementException {
        if (text.isBlank() || startWord.isBlank() || endWord.isBlank()) {
            throw new NullPointerException("received null object. Expected a non-null object.");
        }
        int startIndex = text.indexOf(startWord);
        int endIndex = text.indexOf(endWord) + endWord.length();
        if (startIndex == -1 || endIndex == -1) {
            throw new NoSuchElementException("the words were not found in this text");
        }
        return text.substring(0, startIndex) + text.substring(endIndex) + ("...");
    }
    public String abbreviateFromStart (@NotNull String text, int lengthMax) throws NullPointerException, TextOverwrittenExeption {
        if (text.isBlank()) {
            throw new NullPointerException("received null object. Expected a non-null object.");
        } else if (text.length() <= lengthMax) {
            throw new TextOverwrittenExeption("this action is not possible as it will erase all the received text, please try again with a new base value or a new text.");
        }
        return text.substring(0, lengthMax) + "...";
    }
    public String abbreviateFromEnd (@NotNull String text, int lengthMax) throws NullPointerException, TextOverwrittenExeption {
        if (text.isBlank()) {
            throw new NullPointerException("received null object. Expected a non-null object.");
        } else if (text.length() <= lengthMax) {
            throw new TextOverwrittenExeption("this action is not possible as it will erase all the received text, please try again with a new base value or a new text.");
        }
        return text.substring(0,(text.length() - lengthMax)) + "...";
    }
    public String abbreviateFromIndexToIndex (@NotNull String text, int from, int to) throws NullPointerException, TextOverwrittenExeption {
        if (text.isBlank()) {
            throw new NullPointerException("received null object. Expected a non-null object.");
        } if (from < 0 || to > text.length() || from > to) {
            throw new TextOverwrittenExeption("this action is not possible as it will erase all the received text, please try again with a new base value or a new text.");
        }

        String before = text.substring(0, from);
        String during = text.substring(from, to);
        String after = text.substring(to);

        String abbreviatedDuring = during.charAt(0) + "..." + during.charAt(during.length() - 1);

        return before + abbreviatedDuring + after;
    }
}
