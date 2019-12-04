package com.esoxjem.movieguide.movies.listing

import com.esoxjem.movieguide.movies.api.PopularMoviesResponse
import com.esoxjem.movieguide.movies.api.TheMovieDbApi
import rx.Observable


class ListingInteractorImpl(val movieDbApi: TheMovieDbApi) : ListingInteractor {

    override fun getListOfMovies(): Observable<PopularMoviesResponse> {
        return movieDbApi.getVenues(createQueryMap())
    }

    private fun createQueryMap(): Map<String, String> {
        return hashMapOf(
                "language" to "en",
                "sort_by" to "popularity.desc")
    }
}