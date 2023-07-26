package com.brandon.movieinfoapp.presentation.di

import com.brandon.movieinfoapp.presentation.di.movie.MovieSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
}