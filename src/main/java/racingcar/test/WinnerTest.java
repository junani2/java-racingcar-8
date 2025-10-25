package racingcar.test;

import org.junit.jupiter.api.Test;
import racingcar.CarMovingCount;
import racingcar.RacingMember;
import racingcar.Winner;
import racingcar.view.MovingView;

import java.util.List;

public class WinnerTest {

    @Test
    void WinnerTest() {

        //여러번 값을 돌려서 확인해보기
        List<RacingMember> racingMembers = List.of(
                new RacingMember("red"),
                new RacingMember("blue"),
                new RacingMember("green")
        );
        for (int i = 0; i < 3; i++) {
            CarMovingCount.carMove(racingMembers);
            MovingView.movingOutput(racingMembers);
        }
        Winner.find(racingMembers);
    }
}
