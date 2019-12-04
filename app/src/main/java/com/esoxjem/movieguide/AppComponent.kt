package com.esoxjem.movieguide

import com.esoxjem.movieguide.movies.api.ApiModule
import com.esoxjem.movieguide.movies.listing.ListingComponent
import com.esoxjem.movieguide.movies.listing.ListingModule
import com.esoxjem.movieguide.movies.network.NetworkModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AppModule::class, NetworkModule::class, ApiModule::class))
interface AppComponent {
    fun plus(listingModule: ListingModule): ListingComponent
}
