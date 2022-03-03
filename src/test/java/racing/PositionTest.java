package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PositionTest {

    @Test
    void create_PositionLessThen0_IllegalArgumentExceptionThrown() {
        assertThatThrownBy(() -> new Position(-1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void increase_PositionIncrease1_1() {
        Position position = new Position(0);
        position.increase();
        assertThat(position).isEqualTo(new Position(1));
    }
}
