package ch.hearc.ig.odi.moviemanager.business;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alexandr.ducommun
 */
public class Movie {
    
    private Long id;
    private String name;
    private String producer;
    private Map<Long, Person> people;

    public Movie(Long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.people = new HashMap();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Map<Long, Person> getPeople() {
        return people;
    }

    public void setPeople(Map<Long, Person> people) {
        this.people = people;
    }
    
}
