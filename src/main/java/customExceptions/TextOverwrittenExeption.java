package customExceptions;

public class TextOverwrittenExeption extends Exception{
    public TextOverwrittenExeption(String warning) {
        super(warning);
    }
}
