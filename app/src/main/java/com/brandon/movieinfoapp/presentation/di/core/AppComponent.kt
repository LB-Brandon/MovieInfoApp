package com.brandon.movieinfoapp.presentation.di.core

import com.brandon.movieinfoapp.presentation.di.movie.MovieSubComponent
import dagger.Component
import dagger.Provides
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AppModule::class,
    NetModule::class,
    DataBaseModule::class,
    UseCaseModule::class,
    RepositoryModule::class,
    RemoteDataModule::class,
    LocalDataModule::class,
    CacheDataModule::class
])
interface AppComponent {
    fun movieSubComponent():MovieSubComponent.Factory
//    fun tvShowSubComponent():TvShowSubComponent.Factory
//    fun artistSubComponent():ArtistSubComponent.Factory

}