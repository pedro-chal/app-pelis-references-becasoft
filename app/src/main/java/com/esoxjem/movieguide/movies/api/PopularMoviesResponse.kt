package com.esoxjem.movieguide.movies.api

import com.esoxjem.movieguide.movies.models.Movie
import com.google.gson.annotations.SerializedName


class PopularMoviesResponse {

    @SerializedName("results")
    lateinit var movies: List<Movie>
}