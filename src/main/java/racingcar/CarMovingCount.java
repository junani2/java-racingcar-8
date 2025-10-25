package racingcar;

import java.util.List;

public class CarMovingCount {

    public static void carMove(List<RacingMember> racingMembers) {
        for(RacingMember car : racingMembers) {
           car.move();
        }
    }
}
