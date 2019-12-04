package com.esoxjem.movieguide.movies.listing

import dagger.Subcomponent


@ListingScope
@Subcomponent(modules = arrayOf(ListingModule::class))
interface ListingComponent {
    fun inject(target: ListingFragment)
}