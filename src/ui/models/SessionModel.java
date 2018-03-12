package ui.models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class SessionModel {
    private final ObjectProperty<LocalDate> date;
    private final StringProperty name;
    private final ObservableList<VoteModel> voting;

    public SessionModel(){
        this(null, null);
    }

    public SessionModel(LocalDate date, String name) {
        this.date = new SimpleObjectProperty<LocalDate>(date);
        this.name = new SimpleStringProperty(name);
        this.voting = FXCollections.observableArrayList();
    }

    public LocalDate getDate() {
        return date.get();
    }

    public ObjectProperty<LocalDate> dateProperty() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date.set(date);
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

    public ObservableList<VoteModel> getVoting() {
        return voting;
    }
}
