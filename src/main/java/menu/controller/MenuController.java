package menu.controller;

import menu.view.OutputView;

public class MenuController {

    private InputController inputController;
    private OutputView outputView;

    public MenuController(InputController inputController, OutputView outputView) {
        this.inputController = inputController;
        this.outputView = outputView;
    }

    public void run() {
        String coachNames = inputController.getCoachName();
    }
}
