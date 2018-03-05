package com.martian.springdatarest.entities;

import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by martian on 2018/03/06.
 */
public class Organizer extends AbstractEntity {

    private String name;
    @OneToMany(mappedBy = "organizer")
    private Set<Event> events;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
}
