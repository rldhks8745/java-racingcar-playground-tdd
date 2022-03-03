package racing;

public class RacingCarGame {
    private final Cars cars;

    public RacingCarGame(String names) {
        this.cars = new Cars(names);
    }

    public void move() {
        this.cars.move();
    }
}
