package com.esoxjem.movieguide

import android.app.Application
import com.esoxjem.movieguide.movies.listing.ListingComponent
import com.esoxjem.movieguide.movies.listing.ListingModule
import com.esoxjem.movieguide.movies.network.NetworkModule



class MovieGuideApp : Application() {

    lateinit var appComponent: AppComponent
    lateinit var listingComponent: ListingComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = createAppComponent()
    }

    private fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .networkModule(NetworkModule())
                .appModule(AppModule(this)).build()
    }

    fun createListingComponent(): ListingComponent {
        listingComponent = appComponent.plus(ListingModule())
        return listingComponent
    }

    fun releaseListingComponent() {

    }

}
