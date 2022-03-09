package racing;

import java.io.PrintStream;

public class ResultView {
    private final PrintStream out;

    public ResultView(PrintStream out) {
        this.out = out;
    }

    public void println(String message) {
        out.println(message);
    }
}
