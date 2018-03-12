package core.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Session {
    private String date;
    private String name;
    private List<Vote> voting;

    public Session(String date,
                   String name) {
        this.date = date;
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vote> getVoting() {
        return voting;
    }

    public void setVoting(List<Vote> voting) {
        this.voting = voting;
    }
}
