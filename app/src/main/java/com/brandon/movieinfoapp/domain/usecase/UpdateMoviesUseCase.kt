package com.brandon.movieinfoapp.domain.usecase

import com.brandon.movieinfoapp.data.model.movie.Movie
import com.brandon.movieinfoapp.domain.repository.MovieRepository

class UpdateMoviesUseCase (private val movieRepository: MovieRepository){
    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}