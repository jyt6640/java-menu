package menu.controller;

import java.util.List;
import menu.domain.Coaches;
import menu.util.InputParser;
import menu.view.InputView;
import menu.view.OutputView;

public class InputController {

    private InputView inputView;
    private OutputView outputView;
    private InputParser inputParser;

    public InputController(InputView inputView, OutputView outputView, InputParser inputParser) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.inputParser = inputParser;
    }

    public Coaches getCoachName() {
        while (true) {
            try {
                return new Coaches(readCoachName());
            } catch (IllegalArgumentException e) {
                outputView.printErrorMessage(e);
            }
        }
    }

    private List<String> readCoachName() {
        String value = inputView.readCoachName();
        return inputParser.parseCoaches(value);
    }
}
