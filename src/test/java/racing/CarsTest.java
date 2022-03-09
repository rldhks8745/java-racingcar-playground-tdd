package racing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void parseName_String_구분자_to_List_ListLength3() {
        assertThat(Cars.parseNames("poby,teddy,ruby").size()).isEqualTo(3);
    }

    @Test
    void getMaxPosition_maxPosition구하기() {
        Car poby = new Car("poby", 1);
        Car teddy = new Car("teddy", 0);
        Car ruby = new Car("ruby", 1);

        Cars cars = new Cars(poby, teddy, ruby);

        assertThat(cars.getMaxPosition()).isEqualTo(new Position(1));
    }

    @Test
    void getWinners_가장선두의Car객체얻기() {
        Car poby = new Car("poby", 1);
        Car teddy = new Car("teddy", 0);
        Car ruby = new Car("ruby", 1);

        Cars cars = new Cars(poby, teddy, ruby);

        assertThat(cars.getWinners()).contains(poby, ruby);
    }
}
