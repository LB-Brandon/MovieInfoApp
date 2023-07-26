package com.brandon.movieinfoapp.presentation.di.core

import com.brandon.movieinfoapp.domain.repository.MovieRepository
import com.brandon.movieinfoapp.domain.usecase.GetMoviesUseCase
import com.brandon.movieinfoapp.domain.usecase.UpdateMoviesUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {
    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository) : GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideUpdateMoviesUseCase(movieRepository: MovieRepository) : UpdateMoviesUseCase {
        return UpdateMoviesUseCase(movieRepository)
    }
}