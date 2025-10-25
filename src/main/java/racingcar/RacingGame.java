package racingcar;

import racingcar.view.InputView;
import racingcar.view.MovingView;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    public void run() {

        //입력 받기
        InputView inputView = new InputView();
        String carName = inputView.inputCarName();
        int count = inputView.inputCount();

        //입력 받은 문자열 리스트로 변환하기 
        List<String> carNameList = CarNameList.splitAndConvertToList(carName);

        //리스트에 담긴 값들로 객체 생성하기 + 객체 리스트 만들기
        List<RacingMember> racingMembers = new ArrayList<>();
        for (String name : carNameList) {
            RacingMember c = new RacingMember(name);
            racingMembers.add(c);
        }

        //각 객체들 랜덤 넘버 기반으로 움직이기
        for (int i = 0; i < count; i++) {
            CarMovingCount.carMove(racingMembers);
            MovingView.movingOutput(racingMembers);
        }

        //우승자 구하기
        Winner.find(racingMembers);
    }
}
