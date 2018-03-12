package ui.models;

import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public class FactionModel {
    private final StringProperty name;
    private final ObservableList<DeputyModel> deputies;

    public FactionModel(){
        this(null,null);
    }

    public FactionModel(StringProperty name, ObservableList<DeputyModel> deputies) {
        this.name = name;
        this.deputies = deputies;
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

    public ObservableList<DeputyModel> getDeputies() {
        return deputies;
    }
}
