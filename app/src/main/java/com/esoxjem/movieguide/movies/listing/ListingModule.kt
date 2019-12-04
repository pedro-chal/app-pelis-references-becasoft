package com.esoxjem.movieguide.movies.listing

import com.esoxjem.movieguide.movies.api.TheMovieDbApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * @author arunsasidharan
 */
@Module
class ListingModule {

    @Provides
    fun provideListingPresenter(listingInteractor: ListingInteractor): ListingPresenter {
        return ListingPresenterImpl(listingInteractor, null)
    }

    @Provides @ListingScope
    fun provideListingInteractor(api: TheMovieDbApi): ListingInteractor {
        return ListingInteractorImpl(api)
    }
}