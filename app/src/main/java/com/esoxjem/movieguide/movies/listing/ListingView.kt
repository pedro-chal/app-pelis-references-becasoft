package com.esoxjem.movieguide.movies.listing

import com.esoxjem.movieguide.movies.models.Movie


interface ListingView {
    fun showMovies(movies: List<Movie>?)
}