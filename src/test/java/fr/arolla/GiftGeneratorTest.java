package fr.arolla;

import fr.arolla.christmas.Gift;
import fr.arolla.christmas.GiftGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GiftGeneratorTest {

    private final static String LINE_SEPARATOR = System.lineSeparator();

    @Test
    public void should_generate_a_bear_message_when_child_asked_for_it() {
        final var gift = Gift.BEAR;

        final var result = GiftGenerator.generateGift(gift);
        final var result2 = GiftGenerator.generateGiftYield(gift);

        assertThat(result).isNotNull();
        assertThat(result2).isNotNull();
        assertThat(result).isEqualTo(result2).isEqualTo("Dear child," + LINE_SEPARATOR
                + "Here you have a bear !" + LINE_SEPARATOR
                + LINE_SEPARATOR
                + "Enjoy !" + LINE_SEPARATOR
                + "Santa Claus !");
    }

    @Test
    public void should_generate_a_doll_message_when_child_asked_for_it() {
        final var gift = Gift.DOLL;

        final var result = GiftGenerator.generateGift(gift);
        final var result2 = GiftGenerator.generateGiftYield(gift);

        assertThat(result).isNotNull();
        assertThat(result2).isNotNull();
        assertThat(result).isEqualTo(result2).isEqualTo("Dear child," + LINE_SEPARATOR
                + "Here you have a doll !" + LINE_SEPARATOR
                + LINE_SEPARATOR
                + "Enjoy !" + LINE_SEPARATOR
                + "Santa Claus !");
    }

    @Test
    public void should_generate_a_doll_message_when_child_asked_for_Ken() {
        final var gift = Gift.KEN;

        final var result = GiftGenerator.generateGift(gift);
        final var result2 = GiftGenerator.generateGiftYield(gift);

        assertThat(result).isNotNull();
        assertThat(result2).isNotNull();
        assertThat(result).isEqualTo(result2).isEqualTo("Dear child," + LINE_SEPARATOR
                + "Here you have a doll !" + LINE_SEPARATOR
                + LINE_SEPARATOR
                + "Enjoy !" + LINE_SEPARATOR
                + "Santa Claus !");
    }
}
