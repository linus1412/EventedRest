package smitek.evented;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event {

    private String id;
    private String description;
    private LocalDate date;
    private List<Tag> tags = new ArrayList<Tag>();

    public Event(String id, String description, LocalDate date, List<Tag> tags) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Tag> getTags() {
        return tags;
    }
}
