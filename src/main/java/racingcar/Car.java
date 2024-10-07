package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0; // 초기 위치
    }

    private void drive() {
        int randomValue = Randoms.pickNumberInRange(0, 9);
        if (randomValue >= 4) {
            this.position++;
        }
    }

    public void move() {
        this.drive();  // 내부적으로 drive() 호출
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }


}
