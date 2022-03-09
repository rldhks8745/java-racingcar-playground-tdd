package racing;

import java.util.Objects;
import java.util.stream.IntStream;

public class Position implements Comparable<Position> {
    private int position;

    public Position(int position) {
        if (position < 0)
            throw new IllegalArgumentException("위치값은 음수가 될 수 없습니다.");

        this.position = position;
    }

    public void increase() {
        this.position += 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return "-".repeat(position);
    }

    @Override
    public int compareTo(Position other) {
        return this.position - other.position;
    }
}
