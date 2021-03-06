package ch.hearc.ig.odi.moviemanager.business;

import ch.hearc.ig.odi.moviemanager.exception.UniqueException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alexandr.ducommun
 */
public class Person {
    
    private Long id;
    private String firstName;
    private String lastName;
    private Map<Long, Movie> movies;

    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = new HashMap();
    }
    
    /**
     * Add movie to the movies list of the person and add this person
     * to the people list who saw the movie
     * @param movie movie for adding
     * @throws UniqueException
     */
    public void addMovie(Movie movie) throws UniqueException {
        if(movies.containsKey(movie.getId())) {
            throw new UniqueException("Film deja vu !");
        } else {
            movie.getPeople().put(this.id, this);
            this.movies.put(movie.getId(), movie);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Map<Long, Movie> getMovies() {
        return movies;
    }

    public void setMovies(Map<Long, Movie> movies) {
        this.movies = movies;
    }
    
}
