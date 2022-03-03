package racing;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position(0);
    }

    public void move(int number) {
        if (number >= 4)
            this.position.increase();
    }

    @Override
    public String toString() {
        return String.format("%s : %s", name, position);
    }
}
