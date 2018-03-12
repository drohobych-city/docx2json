package ui.models;

import javafx.beans.property.*;

import java.time.LocalDate;

public class DeputyModel {
    //  deputy models properties
    private final IntegerProperty id;
    private final StringProperty first_name;
    private final StringProperty fathers_name;
    private final StringProperty last_name;
    private final StringProperty faction;
    private final StringProperty photo_links;
    private final ObjectProperty<LocalDate> faction_entry;
    private final ObjectProperty<LocalDate> faction_retirement;
    private final ObjectProperty<LocalDate> acquiring_authority;
    private final ObjectProperty<LocalDate> disqualification;

    public DeputyModel(){
        this(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null);
    }
    // full info constructor
    public DeputyModel(Integer id,
                       String first_name,
                       String fathers_name,
                       String last_name,
                       String faction,
                       String photo_links,
                       LocalDate faction_entry,
                       LocalDate faction_retirement,
                       LocalDate acquiring_authority,
                       LocalDate disqualification) {
        this.id = new SimpleIntegerProperty(id);
        this.first_name = new SimpleStringProperty(first_name);
        this.fathers_name = new SimpleStringProperty(fathers_name);
        this.last_name = new SimpleStringProperty(last_name);
        this.faction = new SimpleStringProperty(faction);
        this.photo_links = new SimpleStringProperty(photo_links);
        this.faction_entry = new SimpleObjectProperty<LocalDate>(faction_entry);
        this.faction_retirement = new SimpleObjectProperty<LocalDate>(faction_retirement);
        this.acquiring_authority = new SimpleObjectProperty<LocalDate>(acquiring_authority);
        this.disqualification = new SimpleObjectProperty<LocalDate>(disqualification);
    }

    public Integer getId() {
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

    public String getPhoto_links() {
        return photo_links.get();
    }

    public StringProperty photo_linksProperty() {
        return photo_links;
    }

    public void setPhoto_links(String photo_links) {
        this.photo_links.set(photo_links);
    }

    public LocalDate getFaction_entry() {
        return faction_entry.get();
    }

    public ObjectProperty<LocalDate> faction_entryProperty() {
        return faction_entry;
    }

    public void setFaction_entry(LocalDate faction_entry) {
        this.faction_entry.set(faction_entry);
    }

    public LocalDate getFaction_retirement() {
        return faction_retirement.get();
    }

    public ObjectProperty<LocalDate> faction_retirementProperty() {
        return faction_retirement;
    }

    public void setFaction_retirement(LocalDate faction_retirement) {
        this.faction_retirement.set(faction_retirement);
    }

    public LocalDate getAcquiring_authority() {
        return acquiring_authority.get();
    }

    public ObjectProperty<LocalDate> acquiring_authorityProperty() {
        return acquiring_authority;
    }

    public void setAcquiring_authority(LocalDate acquiring_authority) {
        this.acquiring_authority.set(acquiring_authority);
    }

    public LocalDate getDisqualification() {
        return disqualification.get();
    }

    public ObjectProperty<LocalDate> disqualificationProperty() {
        return disqualification;
    }

    public void setDisqualification(LocalDate disqualification) {
        this.disqualification.set(disqualification);
    }
}
