package com.brandon.movieinfoapp.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.brandon.movieinfoapp.domain.usecase.GetMoviesUseCase
import com.brandon.movieinfoapp.domain.usecase.UpdateMoviesUseCase

class MovieViewModelFactory(
    private val getMovieUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMovieUseCase, updateMoviesUseCase) as T
    }
}