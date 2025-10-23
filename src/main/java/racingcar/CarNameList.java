package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarNameList {

    public static  List<String> splitAndConvertToList(String memberString) {

        //입력받은 이름 ,을 기준으로 분리 후 리스트에 담기
        return new ArrayList<>(Arrays.asList(memberString.split(",")));
    }
}
