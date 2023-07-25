package com.brandon.movieinfoapp.data.repository.datasource

import com.brandon.movieinfoapp.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB() : List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}