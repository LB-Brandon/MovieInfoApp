package com.brandon.movieinfoapp.domain.repository

import com.brandon.movieinfoapp.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}