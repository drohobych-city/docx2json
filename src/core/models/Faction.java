package core.models;

import java.util.ArrayList;

public class Faction {
    private String name;
    private ArrayList<Deputy> deputies;

    public Faction(String name, ArrayList<Deputy> deputies) {
        this.name = name;
        this.deputies = deputies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Deputy> getDeputies() {
        return deputies;
    }

    public void setDeputies(ArrayList<Deputy> deputies) {
        this.deputies = deputies;
    }
}
