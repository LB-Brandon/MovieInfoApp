package com.brandon.movieinfoapp.presentation.di.core

import com.brandon.movieinfoapp.data.repository.MovieRepositoryImpl
import com.brandon.movieinfoapp.data.repository.datasource.MovieCacheDataSource
import com.brandon.movieinfoapp.data.repository.datasource.MovieLocalDataSource
import com.brandon.movieinfoapp.data.repository.datasource.MovieRemoteDataSource
import com.brandon.movieinfoapp.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ) : MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }
}