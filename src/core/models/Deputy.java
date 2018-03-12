package core.models;

public class Deputy {
    private Integer id;
    private String firstName;
    private String fathersName;
    private String lastName;
    private String faction;
    private String startDate;
    private String endDate;
    private String photoLink;

    public Deputy() {
    }

    public Deputy(
                  Integer id,
                  String firstName,
                  String fathersName,
                  String lastName,
                  String faction,
                  String startDate,
                  String endDate,
                  String photoLink) {
        this.id = id;
        this.firstName = firstName;
        this.fathersName = fathersName;
        this.lastName = lastName;
        this.faction = faction;
        this.startDate = startDate;
        this.endDate = endDate;
        this.photoLink = photoLink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }
}
