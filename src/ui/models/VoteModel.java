package ui.models;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDateTime;

public class VoteModel {
    private final ObjectProperty<LocalDateTime> timestamp;
    private final StringProperty name;
    private final ObservableList<NamedVotingModel> namedVoting;
    private final IntegerProperty missing_count;
    private final IntegerProperty yes_vote_count;
    private final IntegerProperty no_vote_count;
    private final IntegerProperty abstained_vote_count;
    private final IntegerProperty not_voting_count;
    private final BooleanProperty voting_result;

    public VoteModel(){
        this(null,
                null,
                null,
                null,
                null,
                null,
                null,
                null);
    }

    public VoteModel(LocalDateTime timestamp,
                     String name,
                     Integer missing_count,
                     Integer yes_vote_count,
                     Integer no_vote_count,
                     Integer abstained_vote_count,
                     Integer not_voting_count,
                     Boolean voting_result) {
        this.timestamp = new SimpleObjectProperty<>(timestamp);
        this.name = new SimpleStringProperty(name);
        this.namedVoting = FXCollections.observableArrayList();
        this.missing_count = new SimpleIntegerProperty(missing_count);
        this.yes_vote_count = new SimpleIntegerProperty(yes_vote_count);
        this.no_vote_count = new SimpleIntegerProperty(no_vote_count);
        this.abstained_vote_count = new SimpleIntegerProperty(abstained_vote_count);
        this.not_voting_count = new SimpleIntegerProperty(not_voting_count);
        this.voting_result = new SimpleBooleanProperty(voting_result);
    }

    public LocalDateTime getTimestamp() {
        return timestamp.get();
    }

    public ObjectProperty<LocalDateTime> timestampProperty() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp.set(timestamp);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public ObservableList<NamedVotingModel> getNamedVoting() {
        return namedVoting;
    }

    public int getMissing_count() {
        return missing_count.get();
    }

    public IntegerProperty missing_countProperty() {
        return missing_count;
    }

    public void setMissing_count(int missing_count) {
        this.missing_count.set(missing_count);
    }

    public int getYes_vote_count() {
        return yes_vote_count.get();
    }

    public IntegerProperty yes_vote_countProperty() {
        return yes_vote_count;
    }

    public void setYes_vote_count(int yes_vote_count) {
        this.yes_vote_count.set(yes_vote_count);
    }

    public int getNo_vote_count() {
        return no_vote_count.get();
    }

    public IntegerProperty no_vote_countProperty() {
        return no_vote_count;
    }

    public void setNo_vote_count(int no_vote_count) {
        this.no_vote_count.set(no_vote_count);
    }

    public int getAbstained_vote_count() {
        return abstained_vote_count.get();
    }

    public IntegerProperty abstained_vote_countProperty() {
        return abstained_vote_count;
    }

    public void setAbstained_vote_count(int abstained_vote_count) {
        this.abstained_vote_count.set(abstained_vote_count);
    }

    public int getNot_voting_count() {
        return not_voting_count.get();
    }

    public IntegerProperty not_voting_countProperty() {
        return not_voting_count;
    }

    public void setNot_voting_count(int not_voting_count) {
        this.not_voting_count.set(not_voting_count);
    }

    public boolean isVoting_result() {
        return voting_result.get();
    }

    public BooleanProperty voting_resultProperty() {
        return voting_result;
    }

    public void setVoting_result(boolean voting_result) {
        this.voting_result.set(voting_result);
    }
}
