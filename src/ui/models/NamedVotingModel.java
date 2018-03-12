package ui.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class NamedVotingModel {
    private final IntegerProperty id;
    private final StringProperty first_name;
    private final StringProperty fathers_name;
    private final StringProperty last_name;
    private final StringProperty faction;
    private final StringProperty voting_result;

    public NamedVotingModel(Integer id,
                            String first_name,
                            String fathers_name,
                            String last_name,
                            String faction,
                            String voting_result) {
        this.id = new SimpleIntegerProperty(id);
        this.first_name = new SimpleStringProperty(first_name);
        this.fathers_name = new SimpleStringProperty(fathers_name);
        this.last_name = new SimpleStringProperty(last_name);
        this.faction = new SimpleStringProperty(faction);
        this.voting_result = new SimpleStringProperty(voting_result);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getFirst_name() {
        return first_name.get();
    }

    public StringProperty first_nameProperty() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name.set(first_name);
    }

    public String getFathers_name() {
        return fathers_name.get();
    }

    public StringProperty fathers_nameProperty() {
        return fathers_name;
    }

    public void setFathers_name(String fathers_name) {
        this.fathers_name.set(fathers_name);
    }

    public String getLast_name() {
        return last_name.get();
    }

    public StringProperty last_nameProperty() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name.set(last_name);
    }

    public String getFaction() {
        return faction.get();
    }

    public StringProperty factionProperty() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction.set(faction);
    }

    public String getVoting_result() {
        return voting_result.get();
    }

    public StringProperty voting_resultProperty() {
        return voting_result;
    }

    public void setVoting_result(String voting_result) {
        this.voting_result.set(voting_result);
    }
}
