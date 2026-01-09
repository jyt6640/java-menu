package menu.util;

import java.util.Arrays;
import java.util.List;

public class InputParser {

    public List<String> parseCoaches(String input) {
        return Arrays.stream(input.trim().split(","))
                .toList();
    }

    public List<String> parseHateFoods(String input) {
        return Arrays.stream(input.trim().split(","))
                .toList();
    }
}
