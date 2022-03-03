package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @Test
    void create_공백_null_5자리_초과_IllegalArgumentExceptionThrown() {
        assertThatThrownBy(() -> new Name("")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Name(null)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Name("super")).isInstanceOf(IllegalArgumentException.class);
    }
}
