package racingcar.test;

import org.junit.jupiter.api.Test;
import racingcar.CarNameList;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarNameListTest {

    @Test
    void 입력받은_문자열_리스트_분류(){

        String member = "a,b,c,d";
        List<String>  expected =  Arrays.asList("a","b","c","d");
        assertEquals(expected, CarNameList.splitAndConvertToList(member),"리스트로 변환되지 않았습니다");
    }
}
