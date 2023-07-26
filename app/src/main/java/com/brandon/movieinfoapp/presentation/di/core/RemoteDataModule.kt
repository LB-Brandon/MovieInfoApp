package com.brandon.movieinfoapp.presentation.di.core

import com.brandon.movieinfoapp.data.api.TMDBService
import com.brandon.movieinfoapp.data.repository.datasource.MovieRemoteDataSource
import com.brandon.movieinfoapp.data.repository.datasourceImpl.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }
}