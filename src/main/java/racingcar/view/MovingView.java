package racingcar.view;

import racingcar.RacingMember;

public class MovingView {

    public static void movingOutput(RacingMember racingMember) {

        System.out.println(racingMember.getCarName() + " : " + "-".repeat(racingMember.getTotalDistance()));
    }

}
