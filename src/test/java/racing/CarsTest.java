package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void parseName_String_구분자_to_List_ListLength3() {
        assertThat(Cars.parseNames("poby,teddy,ruby").size()).isEqualTo(3);
    }
}
