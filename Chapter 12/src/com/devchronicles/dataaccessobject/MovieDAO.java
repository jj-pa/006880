﻿package com.devchronicles.dataaccessobject;

import java.util.List;

public interface MovieDAO {
    public void addMovie(Movie movie);

    public Movie getMovie(int id);

    public void deleteMovie(int id);

    public void updateMovie(Movie movie);

    public List<Movie> getAllMovies();
}