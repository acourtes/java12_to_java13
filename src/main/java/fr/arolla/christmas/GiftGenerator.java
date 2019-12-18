package fr.arolla.christmas;

public class GiftGenerator {
    private final static String LINE_SEPARATOR = System.lineSeparator();
    private static final String BEAR = "  ___  " + LINE_SEPARATOR
            + "{~._.~}" + LINE_SEPARATOR
            + " ( Y ) " + LINE_SEPARATOR
            + "()~*~()" + LINE_SEPARATOR
            + "(_)-(_)";
    private static final String DOLL = "     &&&    " + LINE_SEPARATOR
            + "    (+.+)   " + LINE_SEPARATOR
            + " ___\\=/___ " + LINE_SEPARATOR
            + "(|_ ~~~  _|)" + LINE_SEPARATOR
            + "   |___|    " + LINE_SEPARATOR
            + "  / _ \\    " + LINE_SEPARATOR
            + " /_/ \\_\\  " + LINE_SEPARATOR
            + "/_)    (_\\  ";

    public static String generateGift(Gift gift) {
        String generatedGift;
        // TODO : use new features of Java 13 to make things more fluent
        switch (gift) {
            case BEAR:
                generatedGift = BEAR;
                break;
            case DOLL:
                generatedGift = DOLL;
                break;
            default:
                generatedGift = "?";
                break;
        }

        return generatedGift;
    }
}
