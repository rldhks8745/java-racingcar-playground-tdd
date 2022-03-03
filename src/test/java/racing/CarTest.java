package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void create() {
        Car car = new Car("sport");
    }

    @Test
    void move() {
        Car car = new Car("teddy");
        car.move(4);

        assertThat(car.toString()).isEqualTo("teddy : -");
    }
}
