package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarNameList {

    public static  List<String> splitAndConvertToList(String memberString) {

        //입력받은 문자열을 ',' 기준으로 분리 후 리스트에 담기
        List<String> carName = new ArrayList<>(Arrays.asList(memberString.split(",")));

        //길이가 5보다 작으면 에러
        for (String name : carName) {
            if (name.length() > 5) {
                throw new IllegalArgumentException();
            }
        }
        return carName;
    }
}
