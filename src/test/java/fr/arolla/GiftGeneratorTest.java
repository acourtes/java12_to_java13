package fr.arolla;

import fr.arolla.christmas.Gift;
import fr.arolla.christmas.GiftGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GiftGeneratorTest {

    private final static String LINE_SEPARATOR = System.lineSeparator();

    @Test
    public void should_generate_a_bear_when_child_asked_for_it() {
        final var gift = Gift.BEAR;

        final var result = GiftGenerator.generateGift(gift);

        assertThat(result).isNotNull();
        assertThat(result).isEqualTo( "  ___  " + LINE_SEPARATOR
                                    + "{~._.~}" + LINE_SEPARATOR
                                    + " ( Y ) " + LINE_SEPARATOR
                                    + "()~*~()" + LINE_SEPARATOR
                                    + "(_)-(_)");
    }

    @Test
    public void should_generate_a_doll_when_child_asked_for_it() {
        final var gift = Gift.DOLL;

        final var result = GiftGenerator.generateGift(gift);

        assertThat(result).isNotNull();
        assertThat(result).isEqualTo( "     &&&    " + LINE_SEPARATOR
                                    + "    (+.+)   " + LINE_SEPARATOR
                                    + " ___\\=/___ " + LINE_SEPARATOR
                                    + "(|_ ~~~  _|)" + LINE_SEPARATOR
                                    + "   |___|    " + LINE_SEPARATOR
                                    + "  / _ \\    " + LINE_SEPARATOR
                                    + " /_/ \\_\\  " + LINE_SEPARATOR
                                    + "/_)    (_\\  ");
    }
}
