package com.brandon.movieinfoapp.data.repository.datasource

import com.brandon.movieinfoapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}