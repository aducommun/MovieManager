package ch.hearc.ig.odi.moviemanager.presentation.bean;

import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.exception.UniqueException;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author alexandr.ducommun
 */
@Named(value = "personCreate")
@RequestScoped
public class PersonCreateBean implements Serializable {

    @Inject
    private Services services;
    private long id;
    private String firstName;
    private String lastName;

    /**
     * Add new person in the list
     *
     * @return "success" if correct parameters, "ErrorDuplicate" if ID is
     * already used
     */
    public String savePerson() {
        Person p = new Person(id, firstName, lastName);
        services.getPeopleList().add(p); //A corriger - Il faut accèder à la map !
        return "success";

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
