package racingcar.test;

import org.junit.jupiter.api.Test;
import racingcar.RacingMember;

import static org.junit.jupiter.api.Assertions.*;


public class RacingMemberCreateTest {

    @Test
    void 객체생성_및_메소드_테스트() {

        RacingMember racingMember = new RacingMember("Blue");
        assertNotNull(racingMember, "객체가 생성되어야 합니다");
        assertEquals(0, racingMember.getTotalDistance(), "처음 Distance는 0이어야 합니다");
        racingMember.move();
        assertEquals(1, racingMember.getTotalDistance(), "1이어야 합니다");
    }
}
