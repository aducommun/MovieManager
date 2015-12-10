package ch.hearc.ig.odi.moviemanager.presentation.bean;

import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author alexandr.ducommun
 */
@Named(value="Persons")
@RequestScoped
public class PersonsBean implements Serializable {
    
    @Inject Services services;
    
    public List<Person> getPersons(){
        return services.getPeopleList();
    }
    
}
