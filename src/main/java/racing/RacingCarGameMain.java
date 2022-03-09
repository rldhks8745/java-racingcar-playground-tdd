package racing;

import java.util.Scanner;
import java.util.stream.Collectors;

public class RacingCarGameMain {

    public static void main(String[] args) {
        InputView inputView = new InputView(System.in);
        ResultView resultView = new ResultView(System.out);

        resultView.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = inputView.nextLine();
        resultView.println("시도할 회수는 몇회인가요?");
        int moveCount = inputView.nextInt();

        resultView.println("실행 결과");
        Cars cars = new Cars(carNames);
        for (int i = 0; i < moveCount; i++) {
            cars.move();
            resultView.println(cars + "\n");
        }

        String winnerNames = cars.getWinners().stream()
                .map(Car::getName)
                .map(Name::toString)
                .collect(Collectors.joining(","));

        resultView.println(winnerNames + "가 최종 우승했습니다.");
    }
}
