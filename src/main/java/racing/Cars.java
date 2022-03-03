package racing;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cars {
    private static final int BOUND_NUMBER = 10;

    private final List<Car> cars;

    public Cars(String names) {
        this.cars = parseNames(names);
    }

    public static List<Car> parseNames(String names) {
        return Arrays.asList(names.split(",")).stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void move() {
        this.cars.forEach(car -> car.move(new Random().nextInt(BOUND_NUMBER)));
    }
}
