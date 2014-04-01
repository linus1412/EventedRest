package smitek.evented;

public class Tag {

    private String id;
    private String description;

    public Tag(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
