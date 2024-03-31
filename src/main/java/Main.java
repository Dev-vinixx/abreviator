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
