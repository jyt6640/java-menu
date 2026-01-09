package menu.config;

import menu.controller.InputController;
import menu.controller.MenuController;
import menu.util.InputParser;
import menu.view.InputView;
import menu.view.OutputView;

public class AppConfig {

    public InputView inputView() {
        return new InputView();
    }

    public OutputView outputView() {
        return new OutputView();
    }

    public InputParser inputParser() {
        return new InputParser();
    }

    public InputController inputController(){
        return new InputController(
                inputView(),
                outputView(),
                inputParser()
        );
    }

    public MenuController menuController() {
        return new MenuController(
                inputController(),
                outputView()
        );
    }
}
