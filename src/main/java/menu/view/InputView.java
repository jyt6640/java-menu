package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.Coach;

public class InputView {

    public String readCoachName() {
        System.out.println("점심 메뉴 추천을 시작합니다.");
        System.out.println();
        System.out.println("코치의 이름을 입력해 주세요. (, 로 구분)");
        String value = readLine();
        System.out.println();
        return value;
    }

    public String readHateFood(String coach) {
        System.out.println(coach + "(이)가 못 먹는 메뉴를 입력해 주세요.");
        String value = readLine();
        return value;
    }

    protected String readLine() {
        return Console.readLine();
    }

}
