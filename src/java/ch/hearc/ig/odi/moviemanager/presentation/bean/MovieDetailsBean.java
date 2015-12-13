package ch.hearc.ig.odi.moviemanager.presentation.bean;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author alexandr.ducommun
 */

@Named(value="MovieDetails")
@SessionScoped
public class MovieDetailsBean implements Serializable{
    
    private Movie movie;
    
}
