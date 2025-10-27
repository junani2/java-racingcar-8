package racingcar.util;

import racingcar.domain.RacingMember;
import racingcar.view.OutputView;

import java.util.List;

public class Winner {

    public static void find(List<RacingMember> racingMembers) {

        //최대 거리 값 구하기
        int maxDistance = racingMembers.stream()
                .mapToInt(RacingMember::getTotalDistance)
                .max()
                .orElse(0);

        //리스트를 순회해 최대 거리 값인 객체들 반환
        List<String> winners = racingMembers.stream()
                .filter(r -> r.getTotalDistance() == maxDistance)
                .map(RacingMember::getCarName)
                .toList();

       OutputView.result(winners);
    }
}
