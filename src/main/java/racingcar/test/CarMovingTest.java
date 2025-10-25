package racingcar.test;

import org.junit.jupiter.api.Test;
import racingcar.Car;
import racingcar.RacingMember;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarMovingTest {

    @Test
    void carMovingTest() {
        Car c = new RacingMember("blue");
        assertEquals(0, c.getTotalDistance(), "처음 Distance는 0이어야 합니다");
        c.move();
        assertEquals(1, c.getTotalDistance(), "1이어야 합니다");
    }
}
