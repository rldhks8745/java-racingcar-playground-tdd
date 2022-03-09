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

    public Cars(Car... cars) {
        this.cars = List.of(cars);
    }

    public static List<Car> parseNames(String names) {
        return Arrays.stream(names.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public List<Car> getWinners() {
        return this.cars.stream()
                .filter(car -> car.getPosition().equals(getMaxPosition()))
                .collect(Collectors.toList());
    }

    Position getMaxPosition() {
        return this.cars.stream()
                .map(Car::getPosition)
                .max(Position::compareTo)
                .orElseThrow();
    }

    public void move() {
            this.cars.forEach(car -> car.move(new Random().nextInt(BOUND_NUMBER)));
    }

    @Override
    public String toString() {
        return this.cars.stream().map(Car::toString).collect(Collectors.joining("\n"));
    }
}
