package menu.domain;

import java.util.List;

public class Coach {

    private String coach;
    private List<String> hateFood;

    public Coach(String coach, List<String> hateFood) {
        this.coach = coach;
        this.hateFood = hateFood;
    }

    public String getCoach() {
        return coach;
    }

    public List<String> getHateFood() {
        return hateFood;
    }
}
