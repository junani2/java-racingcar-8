package racingcar.util;

import racingcar.domain.RacingMember;

import java.util.List;

public class CarMovingCount {

    public static void carMove(List<RacingMember> racingMembers) {

        for(RacingMember car : racingMembers) {
           car.move();
        }
    }
}
