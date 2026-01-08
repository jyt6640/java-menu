package menu.controller;

import menu.view.InputView;
import menu.view.OutputView;

public class InputController {

    private InputView inputView;
    private OutputView outputView;

    public InputController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public String getCoachName() {
        while (true) {
            try {
                return readCoachName();
            } catch (IllegalArgumentException e) {
                outputView.printErrorMessage(e);
            }
        }
    }

    private String readCoachName() {
        String value = inputView.readCoachName();
        return value;
    }
}
