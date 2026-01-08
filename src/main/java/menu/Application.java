package menu;

import menu.config.AppConfig;
import menu.controller.MenuController;

public class Application {
    public static void main(String[] args) {
        AppConfig config = new AppConfig();
        MenuController controller = config.menuController();
        controller.run();
    }
}
