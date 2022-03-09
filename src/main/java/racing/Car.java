package racing;

public class Car {

    private static final int EXCEED_MOVABLE_NUMBER = 4;

    private final Name name;
    private final Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(int number) {
        if (number >= EXCEED_MOVABLE_NUMBER)
            this.position.increase();
    }

    @Override
    public String toString() {
        return String.format("%s : %s", name, position);
    }

    public Name getName() {
        return this.name;
    }

    public Position getPosition() {
        return this.position;
    }
}
