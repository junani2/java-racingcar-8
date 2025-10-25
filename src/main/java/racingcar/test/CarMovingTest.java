package racingcar.test;

import org.junit.jupiter.api.Test;
import racingcar.Car;
import racingcar.CarMovingCount;
import racingcar.RacingMember;
import racingcar.view.MovingView;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarMovingTest {

    @Test
    void carMovingTest() {

        //여러번 값을 돌려서 확인해보기
        List<RacingMember> racingMembers = List.of(
                new RacingMember("red"),
                new RacingMember("blue"),
                new RacingMember("green")
        );
        for (int i = 0; i < 3;i++){
            CarMovingCount.carMove(racingMembers);
            MovingView.movingOutput(racingMembers);
        }

    }
}
