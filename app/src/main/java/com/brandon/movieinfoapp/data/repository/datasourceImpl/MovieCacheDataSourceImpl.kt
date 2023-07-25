package com.brandon.movieinfoapp.data.repository.datasourceImpl

import com.brandon.movieinfoapp.data.model.movie.Movie
import com.brandon.movieinfoapp.data.repository.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl : MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}