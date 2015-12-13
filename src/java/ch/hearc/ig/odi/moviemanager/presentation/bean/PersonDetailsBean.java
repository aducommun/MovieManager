package ch.hearc.ig.odi.moviemanager.presentation.bean;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author alexandr.ducommun
 */

@Named(value="personDetails")
@SessionScoped
public class PersonDetailsBean implements Serializable {
    
    @Inject private Services services;
            private Person person;
    
    public String displayPerson(Person p) {
        if(p == null) {
            return "error";
        } else {
            person = p;
            return "display";
        }
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Movie> getPersonMovies() {
        return new ArrayList(person.getMovies().values());
    }
}
