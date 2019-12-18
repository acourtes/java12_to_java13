package fr.arolla.christmas;

public class GiftGenerator {
    private static final String MODEL = """
            Dear child,
            Here you have a %s !

            Enjoy !
            Santa Claus !""";

    public static String generateGift(Gift gift) {
        // First way of assigning a variable with a switch expression
        return switch (gift) {
            case BEAR -> getBearMessage();
            case DOLL, KEN -> getDollMessage();
        };
    }

    public static String generateGiftYield(Gift gift) {
        // Second way of assigning a variable with a switch expression
        return switch (gift) {
            case BEAR: yield getBearMessage();
            case DOLL:
            case KEN: yield getDollMessage();

        };
    }

    private static String getDollMessage() {
        return String.format(MODEL, "doll");
    }

    private static String getBearMessage() {
        return String.format(MODEL, "bear");
    }
}
