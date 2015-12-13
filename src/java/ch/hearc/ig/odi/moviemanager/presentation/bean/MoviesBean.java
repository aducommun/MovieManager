/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.presentation.bean;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author alexandr.ducommun
 */

@Named(value="movies")
@SessionScoped
public class MoviesBean implements Serializable {
    
    @Inject Services services;
    
    public List<Movie> getMovies() {
        return services.getMoviesList();
    }
    
}
