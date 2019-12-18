package fr.arolla.christmas;

public class GiftGenerator {
    private final static String LINE_SEPARATOR = System.lineSeparator();
    // TODO : use new feature of Java 13 to have a text block and not strings concatenation
    private static final String MODEL = "Dear child," + LINE_SEPARATOR
            + "Here you have a %s !" + LINE_SEPARATOR
            + LINE_SEPARATOR
            + "Enjoy !" + LINE_SEPARATOR
            + "Santa Claus !";

    public static String generateGift(Gift gift) {
        String generatedGift;
        // TODO : use new features of Java 13 to make things more fluent
        // You have 2 ways of doing this
        switch (gift) {
            case BEAR:
                generatedGift = String.format(MODEL, "bear");
                break;
            case DOLL:
            case KEN:
                generatedGift = String.format(MODEL, "doll");
                break;
            default:
                generatedGift = "?";
                break;
        }

        return generatedGift;
    }
}
