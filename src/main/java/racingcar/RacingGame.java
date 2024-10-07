package racingcar;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars;
    private int trialCount;


    public RacingGame(List<String> carNames, int trialCount) {
        this.cars = createCars(carNames);
        this.trialCount = trialCount;
    }


    private List<Car> createCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>(); //  Car 클래스의 객체들을 저장
        for (String name : carNames) {
            cars.add(new Car(name));
        }
        return cars;
    }

    //게임 실행 메서드
    public void startRace() {
        for (int i = 1; i <= trialCount; i++) {
            System.out.println(i + "차 시도");
            raceOnce();
        }
        //우승자 출력
        announceWinners();
    }

    //한 번의 시도에서 모든 자동차를 주행
    private void raceOnce() {
        for (Car car : cars) {
            car.move();
            System.out.println(car.getName() + "의 위치: " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    // 우승자 계산 및 발표
    private void announceWinners() {
        int maxPosition = findMaxPosition();
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        System.out.println("최종 우승자: " + String.join(", ", winners));
    }

    // 가장 멀리 간 자동차의 위치 찾기
    private int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }


}
