package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class Coaches {

    private List<Coach> coaches;

    public Coaches(List<String> coach) {
        List<Coach> cs = new ArrayList<>();
        for (String c : coach) {
            cs.add(new Coach(c));
        }
        this.coaches = cs;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }
}
