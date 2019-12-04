package com.esoxjem.movieguide.movies.api

import retrofit2.http.GET
import retrofit2.http.QueryMap
import rx.Observable



interface TheMovieDbApi {
    @GET("/3/discover/movie?sort_by=popularity.desc&api_key=9d5e352ab94e5a42a89464d6f845bd24&language=es-EU")
    fun getVenues(@QueryMap map: Map<String, String>): Observable<PopularMoviesResponse>
}
