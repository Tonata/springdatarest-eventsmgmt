package com.martian.springdatarest.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Set;

/**
 * Created by martian on 2018/03/06.
 */
@JsonPropertyOrder({"resourceId"}) // tell application show resource id as first field in response
@Entity
public class Event extends AbstractEntity {

    private String name;
    @JsonProperty("desc")
    private String description;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private ZoneId zoneId;
    private Boolean started;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private Organizer organizer;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "event")
    private Set<Participant> participants;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @RestResource(exported = false) // create venue as part of event
    private Venue venue;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    public Boolean isStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean getStarted() {
        return started;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Long getResourceId(){
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id, ((Event) obj).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
