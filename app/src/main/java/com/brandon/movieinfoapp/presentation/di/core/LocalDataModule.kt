package com.brandon.movieinfoapp.presentation.di.core

import com.brandon.movieinfoapp.data.db.MovieDao
import com.brandon.movieinfoapp.data.repository.datasource.MovieLocalDataSource
import com.brandon.movieinfoapp.data.repository.datasourceImpl.MovieLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movie: MovieDao) : MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movie)
    }
}