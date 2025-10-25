package racingcar.view;

import racingcar.RacingMember;

import java.util.List;

public class MovingView {

    public static void output(List<RacingMember> racingMember) {

        for (RacingMember car : racingMember) {
            System.out.println(car.getCarName() + " : " + "-".repeat(car.getTotalDistance()));
        }
    }

}
