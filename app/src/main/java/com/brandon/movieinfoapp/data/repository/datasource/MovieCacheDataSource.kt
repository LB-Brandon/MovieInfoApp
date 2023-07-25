package com.brandon.movieinfoapp.data.repository.datasource

import com.brandon.movieinfoapp.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache() : List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}