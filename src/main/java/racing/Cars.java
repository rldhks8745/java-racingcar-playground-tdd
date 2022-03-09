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
        return Arrays.asList(names.split(",")).stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public List<Car> getWinners() {
        return this.cars.stream()
                .filter(car -> car.getPosition().equals(getMaxPosition()))
                .collect(Collectors.toList());
    }

    Position getMaxPosition() {
        Position maxPosition = new Position(0);

        for (int i = 0; i < this.cars.size(); i++) {
            Position carPosition = this.cars.get(i).getPosition();
            if (carPosition.compareTo(maxPosition) > 0) {
                maxPosition = carPosition;
            }
        }

        return maxPosition;
    }

    public void move() {
        this.cars.forEach(car -> car.move(new Random().nextInt(BOUND_NUMBER)));
    }
}
