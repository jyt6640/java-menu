package menu.controller;

import java.util.ArrayList;
import java.util.List;
import menu.domain.Coach;
import menu.domain.Coaches;
import menu.view.OutputView;

public class MenuController {

    private InputController inputController;
    private OutputView outputView;

    public MenuController(InputController inputController, OutputView outputView) {
        this.inputController = inputController;
        this.outputView = outputView;
    }

    public void run() {
        List<String> coachNames = inputController.getCoachName();
        List<Coach> coachesName = new ArrayList<>();
        for (String coach : coachNames) {
            coachesName.add(new Coach(coach, getHateFood(coach)));
        }
        Coaches coaches = new Coaches(coachesName);

    }

    private List<String> getHateFood(String coach) {
        return inputController.getHateFoods(coach);
    }
}
