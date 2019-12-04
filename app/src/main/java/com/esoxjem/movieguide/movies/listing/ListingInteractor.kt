package com.esoxjem.movieguide.movies.listing

import com.esoxjem.movieguide.movies.api.PopularMoviesResponse
import rx.Observable

interface ListingInteractor {
    fun getListOfMovies() : Observable<PopularMoviesResponse>
}