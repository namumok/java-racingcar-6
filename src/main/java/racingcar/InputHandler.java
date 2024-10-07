package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputHandler {

    //사용자에게 자동차 이름을 입력받고 리스트로 반환
    public List<String> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        //사용자 입력
        String input = Console.readLine().trim();

        // 쉼표로 구분된 문자열을 배열로 변환
        String[] carNamesArray = input.split(",");

        List<String> carNames = new ArrayList<>();
        for (String carName : carNamesArray) {
            carNames.add(carName.trim());
        }

        return carNames;
    }

    public int getTrialCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return Integer.parseInt(Console.readLine().trim());
    }

}
