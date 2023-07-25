package com.brandon.movieinfoapp.data.repository.datasourceImpl

import com.brandon.movieinfoapp.data.api.TMDBService
import com.brandon.movieinfoapp.data.model.movie.MovieList
import com.brandon.movieinfoapp.data.repository.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}