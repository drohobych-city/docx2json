package core.models;

import java.util.Map;

public class Vote {
    private String timestamp;
    private String name;
    private Map<Integer,String> voting;

    public Vote(String timestamp, String name, Map<Integer, String> namedVoting) {
        this.timestamp = timestamp;
        this.name = name;
        this.voting = namedVoting;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, String> getVoting() {
        return voting;
    }

    public void setVoting(Map<Integer, String> voting) {
        this.voting = voting;
    }
}
