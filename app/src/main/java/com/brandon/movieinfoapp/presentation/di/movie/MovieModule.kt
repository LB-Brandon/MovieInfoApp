package com.brandon.movieinfoapp.presentation.di.movie

import com.brandon.movieinfoapp.domain.usecase.GetMoviesUseCase
import com.brandon.movieinfoapp.domain.usecase.UpdateMoviesUseCase
import com.brandon.movieinfoapp.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieRepositoryFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUseCase
        )
    }
}