package racingcar.view;

import java.util.List;

public class OutputView {

    public static String  result(List<String> winners) {

       return  String.join(", ", winners);
    }
}
