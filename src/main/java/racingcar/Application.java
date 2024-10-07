package racingcar;

import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        // InputHandler 인스턴스를 생성하여 사용자 입력 처리
        InputHandler inputHandler = new InputHandler();

        // 사용자 입력 받기
        List<String> carNames = inputHandler.getCarNames();
        int trialCount = inputHandler.getTrialCount();

        // RacingGame 시작
        RacingGame racingGame = new RacingGame(carNames, trialCount);
        racingGame.startRace();  // 게임 실행
    }
}
