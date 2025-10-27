package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberPicking {

    public static int pickRandomNumber() {

        //0~9까지
        return Randoms.pickNumberInRange(0, 9);
    }
}
